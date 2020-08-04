package com.codurance.factory.simple;

import com.codurance.factory.simple.entities.CheesePizza;
import com.codurance.factory.simple.entities.HawaiianPizza;
import com.codurance.factory.simple.entities.PepperoniPizza;
import com.codurance.factory.simple.entities.Pizza;
import com.codurance.factory.simple.entities.VeggiePizza;

public class SimplePizzaFactory {
  public Pizza createPizza(String type){
    Pizza pizza = null;

    if (type.equals("cheese")){
      pizza = new CheesePizza();
    } else if (type.equals("pepperoni")){
      pizza = new PepperoniPizza();
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza();
    } else if (type.equals("hawaiian")) {
      pizza = new HawaiianPizza();
    }

    return pizza;
  }
}
