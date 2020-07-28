package com.codurance.entities;

import com.codurance.behaviors.FlyBehavior;
import com.codurance.behaviors.QuackBehavior;

public interface Duck {
  void setFlyBehavior(FlyBehavior flyBehavior);

  void setQuackBehavior(QuackBehavior quackBehavior);

  void swim();

  void display();

  void preformQuack();

  void performFly();
}
