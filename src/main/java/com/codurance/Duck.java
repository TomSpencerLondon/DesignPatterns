package com.codurance;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public void swim() {
    System.out.println("Look at me I can swim");
  }

  public abstract void display();

  public void preformQuack() {
    quackBehavior.quack();
  }
  public void performFly() {
    flyBehavior.fly();
  }
}
