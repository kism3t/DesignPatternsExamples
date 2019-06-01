package com.pattern.design.creational.abstractfactory;

public class Client {

  public static void main(String[] args) {
    AbstractProductA productA1 = ConcreteFactory1.getInstance().createProductA();
    AbstractProductB productB1 = ConcreteFactory1.getInstance().createProductB();

    AbstractProductA productA2 = ConcreteFactory2.getInstance().createProductA();
    AbstractProductB productB2 = ConcreteFactory2.getInstance().createProductB();
  }
}
