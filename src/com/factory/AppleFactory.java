package com.factory;

public class AppleFactory extends FruitFactory<Apple>{
    @Override
    public Apple getDefault() {
        return new Apple();
    }
}
