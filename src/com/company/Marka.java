package com.company;

public enum Marka {
    Mercedes("Мерседес"),
    BMW("БМВ"),
    KIA("Киа"),
    LADA("Лада");

    public final String name;

    Marka(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
