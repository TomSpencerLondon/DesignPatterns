package com.codurance.entities;

import com.codurance.behaviors.FlyWithWings;
import com.codurance.behaviors.Quack;
import com.codurance.entities.Duck;

public class RedheadDuck extends Duck {

  public RedheadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display(){
    System.out.println("I look like a Redhead!");
  }
}
