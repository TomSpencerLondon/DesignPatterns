package com.codurance.behaviors;

import com.codurance.behaviors.QuackBehavior;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack!");
  }
}
