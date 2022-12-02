package com.company;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месца: ");
        int a = sc.nextInt();
        Month month;
        switch (a) {
            case 1:
                month = Month.January;
                System.out.println("Сегодня " + month.getText());
                break;
            case 2:
                month = Month.February;
                System.out.println("Сегодня " + month.getText());
                break;
            case 3:
                month = Month.March;
                System.out.println("Сегодня " + month.getText());
                break;
            case 4:
                month = Month.April;
                System.out.println("Сегодня " + month.getText());
                break;
            case 5:
                month = Month.May;
                System.out.println("Сегодня " + month.getText());
                break;
            case 6:
                month = Month.June;
                System.out.println("Сегодня " + month.getText());
                break;
            case 7:
                month = Month.July;
                System.out.println("Сегодня " + month.getText());
                break;
            case 8:
                month = Month.August;
                System.out.println("Сегодня " + month.getText());
                break;
            case 9:
                month = Month.September;
                System.out.println("Сегодня " + month.getText());
                break;
            case 10:
                month = Month.October;
                System.out.println("Сегодня " + month.getText());
                break;
            case 11:
                month = Month.November;
                System.out.println("Сегодня " + month.getText());
                break;
            case 12:
                month = Month.December;
                System.out.println("Сегодня " + month.getText());
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }

    public static void task2() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите ваш бюджет: ");
        int user_price = sc.nextInt();
        Autos[] auto_mas = new Autos[Autos.values().length];
        Map<Autos, Integer>map = new HashMap<>();
        int i=0;
        for (Autos a:Autos.values()){
            if(a.price<user_price){
                auto_mas[i] = a;
            }
            i+=1;
        }
        for (int j =0;j<Autos.values().length;j++){
            if (auto_mas[j]!=null){
                map.put(auto_mas[j],auto_mas[j].getSpeed());
            }
        }
        LinkedHashMap<Autos, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Autos, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (int num : list) {
            for (Entry<Autos, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(num)) {
                    //на всякий случай пусть будет отсортированная хэшмапа
                    sortedMap.put(entry.getKey(), num);
                    String color = entry.getKey().color;
                    Color cl = Color.valueOf(color);
                    String mark = entry.getKey().manufacturer;
                    Marka mr = Marka.valueOf(mark);
                    System.out.println(Autos.toString(entry.getKey())+cl.getName()+" цвет. Марка: "+mr.getName());
                }
            }
        }
        if(sortedMap.size() ==0){
            System.out.println("Извините, по таким критериям машин найти не удалось.");
        }
    }
}