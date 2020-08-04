package com.codurance.factory.simple;

import com.codurance.factory.simple.entities.Pizza;

public class PizzaStore {

  SimplePizzaFactory simplePizzaFactory;

  public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
    this.simplePizzaFactory = simplePizzaFactory;
  }

  public Pizza orderPizza(String type){
    Pizza pizza = simplePizzaFactory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
