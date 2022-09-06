package com.factory;

public class OrangeFactory extends FruitFactory<Orange>{
    @Override
    public Orange getDefault() {
        return new Orange();
    }
}
