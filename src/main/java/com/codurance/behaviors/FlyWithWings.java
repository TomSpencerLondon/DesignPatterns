package com.codurance.behaviors;

import com.codurance.behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I am flying with wings!");
  }
}
