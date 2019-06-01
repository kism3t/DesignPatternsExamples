package com.pattern.design.creational.abstractfactory;

public class ConcreteFactory2 implements AbstractFactory {

  private static ConcreteFactory2 instance;

  @Override
  public AbstractProductA createProductA() {
    return new ProductA2("nameProdA2Factory2", "propertyProdA2Factory2");
  }

  @Override
  public AbstractProductB createProductB() {
    return new ProductB2();
  }

  public static ConcreteFactory2 getInstance() {
    if (instance == null) {
      instance = new ConcreteFactory2();
    }
    return instance;
  }
}
