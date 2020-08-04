package com.codurance.factory.simple;


import com.codurance.factory.method.entities.Pizza;

public class App {

  public static void main(String[] args) {
    PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

    Pizza cheesePizza = pizzaStore.orderPizza("cheese");
    Pizza veggiePizza = pizzaStore.orderPizza("veggie");
    Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
    Pizza hawaiianPizza = pizzaStore.orderPizza("hawaiian");

    System.out.println();
    System.out.println();

    cheesePizza.eat();
    veggiePizza.eat();
    pepperoniPizza.eat();
    hawaiianPizza.eat();
  }
}
