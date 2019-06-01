package com.pattern.design.creational.abstractfactory;

public class ConcreteFactory1 implements AbstractFactory {

  private static ConcreteFactory1 instance;

  private ConcreteFactory1() {}

  @Override
  public AbstractProductA createProductA() {
    return new ProductA1("nameProdA1Factory1", "propertyProdA1Factory1");
  }

  @Override
  public AbstractProductB createProductB() {
    return new ProductB1();
  }

  public static ConcreteFactory1 getInstance() {
    if (instance == null) {
      instance = new ConcreteFactory1();
    }
    return instance;
  }
}
