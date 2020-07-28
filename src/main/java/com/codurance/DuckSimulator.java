package com.codurance;

import java.util.List;

public class DuckSimulator {

  public static void main(String[] args) {
    List<Duck> ducks = List.of(new MallardDuck(), new RedheadDuck(), new RubberDuck());

    ducks.forEach(duck -> {
      duck.display();
      duck.swim();
      duck.quack();
      System.out.println();
    });
  }
}
