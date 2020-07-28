package com.codurance;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display(){
    System.out.println("I look like a mallard!");
  }
}
