package com.codurance;

import java.util.List;

public class DuckSimulator {

  public static void main(String[] args) {
    List<Duck> ducks = List.of(new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck());

    ducks.forEach(duck -> {
      duck.display();
      duck.swim();
      duck.quack();
      if (duck instanceof Flyable){
        ((Flyable) duck).fly();
      }
      System.out.println();
    });
  }
}
