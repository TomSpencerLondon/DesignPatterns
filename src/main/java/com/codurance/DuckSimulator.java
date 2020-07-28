package com.codurance;

import com.codurance.entities.DecoyDuck;
import com.codurance.entities.Duck;
import com.codurance.entities.MallardDuck;
import com.codurance.entities.RedheadDuck;
import com.codurance.entities.RubberDuck;
import com.codurance.entities.WildTurkey;
import java.util.List;

public class DuckSimulator {

  public static void main(String[] args) {
    List<Duck> ducks = List.of(
        new MallardDuck(),
        new RedheadDuck(),
        new RubberDuck(),
        new DecoyDuck(),
        new TukeyAdapter(new WildTurkey())
    );

    ducks.forEach(duck -> {
      duck.display();
      duck.swim();
      duck.preformQuack();
      duck.performFly();
      System.out.println();
    });

    Duck mallardDuck = new MallardDuck();
    mallardDuck.performFly();
    mallardDuck.setFlyBehavior(() -> System.out.println("I'm injured!"));
    mallardDuck.performFly();
  }
}
