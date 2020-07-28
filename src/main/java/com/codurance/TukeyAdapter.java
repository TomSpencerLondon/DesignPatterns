package com.codurance;

import com.codurance.behaviors.FlyBehavior;
import com.codurance.behaviors.QuackBehavior;
import com.codurance.entities.Duck;
import com.codurance.entities.Turkey;

public class TukeyAdapter implements Duck {


  private Turkey turkey;

  public TukeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void setFlyBehavior(FlyBehavior flyBehavior) {
  }

  @Override
  public void setQuackBehavior(QuackBehavior quackBehavior) {
  }

  @Override
  public void swim() {
    System.out.println("I'm a turkey and I don't swim!");
  }

  @Override
  public void display() {
    System.out.println("I'm a turkey");
  }

  @Override
  public void preformQuack() {
    turkey.gobble();
  }

  @Override
  public void performFly() {
    turkey.fly();
  }
}
