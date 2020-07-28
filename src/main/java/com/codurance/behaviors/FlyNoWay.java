package com.codurance.behaviors;

import com.codurance.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I don't fly!");
  }
}
