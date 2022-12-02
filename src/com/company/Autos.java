package com.company;

public enum Autos{
    Mercedes_GLE_AMG(290,"Mercedes",5000000,"black"),
    BMW_M5(300,"BMW",4800000,"blue"),
    KIA_Rio(200,"KIA",1500000,"yellow"),
    LADA_Granta(150,"LADA",1000000,"black"),
    LADA_Calina(180,"LADA",1200000,"green");

    public final int speed;
    public final String manufacturer;
    public final int price;
    public final String color;


    public int getSpeed() {
        return speed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    Autos(int speed, String manufacturer, int price, String color) {
        this.speed = speed;
        this.manufacturer = manufacturer;
        this.price = price;
        this.color = color;
    }

    public static String toString(Autos au){
        return ("Очень хороший автомобиль  всего за "+au.price +" рублей. Гонит до "+au.speed + " км/ч. Модель:"+ au+". ");
    }



}
