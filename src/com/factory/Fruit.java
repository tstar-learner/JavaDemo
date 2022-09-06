package com.factory;

public abstract class Fruit {
    private final String name;

    public Fruit(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
