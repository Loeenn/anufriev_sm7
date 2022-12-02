package com.company;

public enum Month {
    January("Январь",1),

    February("Февраль",2),

    March("Март",3),

    April("Апрель",4),

    May("Май",5),
    June("Июнь",6),

    July("Июль",7),

    August("Август",8),
    September("Сентябрь",9),

    October("Октябрь",10),

    November("Ноябрь",11),
    December("Декабрь",12);


    public String getText() {
        return text;
    }
    public  final String text;
    public  final int num;
    Month(String text,int num) {
        this.text = text;
        this.num = num;
    }
}
