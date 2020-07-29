package com.codurance.decorator;

import com.codurance.decorator.entities.Beverage;
import com.codurance.decorator.entities.DarkRoast;
import com.codurance.decorator.entities.Decaf;
import com.codurance.decorator.entities.Espresso;
import com.codurance.decorator.entities.HouseBlend;
import com.codurance.decorator.entities.Mocha;
import com.codurance.decorator.entities.Whip;
import java.util.List;

public class Barrista {

  public static void main(String[] args) {
    List<Beverage> beverages = List.of(
      new DarkRoast(), new Decaf(), new HouseBlend(), new Espresso()
    );

    beverages.forEach(System.out::println);

    Beverage beverage = new DarkRoast();
    beverage = new Whip(new Mocha(beverage));

    System.out.println(beverage);
  }
}
