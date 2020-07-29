package com.codurance.strategyadapter.entities;

import com.codurance.strategyadapter.behaviors.FlyNoWay;

public class DecoyDuck extends DuckImpl {

  public DecoyDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = () -> {};
  }

  @Override
  public void display() {
    System.out.println("I look a bit wooden! I am a decoy!");
  }
}
