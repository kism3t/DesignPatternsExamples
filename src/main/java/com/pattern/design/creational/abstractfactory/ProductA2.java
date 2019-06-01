package com.pattern.design.creational.abstractfactory;

public class ProductA2 extends AbstractProductA {

    private String name;
    private String property;

    public ProductA2(String name, String property) {
        this.name = name;
        this.property = property;
    }

    @Override
    public String getProductAName() {
        return name;
    }

    @Override
    public String getProductAProperty() {
        return property;
    }
}
