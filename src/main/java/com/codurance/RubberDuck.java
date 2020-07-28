package com.codurance;

public class RubberDuck extends Duck {

  public RubberDuck() {
    quackBehavior = () -> System.out.println("Squeek!");
    flyBehavior = new FlyNoWay();
  }

  @Override
  public void display(){
    System.out.println("I look like a rubber duck!");
  }
}
