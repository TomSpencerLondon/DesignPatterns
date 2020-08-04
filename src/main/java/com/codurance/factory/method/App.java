package com.codurance.factory.method;

import com.codurance.factory.method.entities.ChicagoPizzaStore;
import com.codurance.factory.method.entities.NYPizzaStore;
import com.codurance.factory.method.entities.Pizza;
import com.codurance.factory.method.entities.PizzaStore;

public class App {

  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Tom ordered a " + pizza.getName() + "\n");

    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza.getName() + "\n");
  }
}
