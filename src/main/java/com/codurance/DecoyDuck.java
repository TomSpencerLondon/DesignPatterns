package com.codurance;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = () -> {};
  }

  @Override
  public void display() {
    System.out.println("I look a bit wooden! I am a decoy!");
  }
}
