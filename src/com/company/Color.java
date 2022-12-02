package com.company;

public enum Color {
    green("Зеленый"),
    blue("Синий"),
    black("Чёрный"),
    yellow("Жёлтый");

    public final String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
