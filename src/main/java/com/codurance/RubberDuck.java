package com.codurance;

public class RubberDuck extends Duck {
  @Override
  public void display(){
    System.out.println("I look like a rubber duck!");
  }

  @Override
  public void quack(){
    System.out.println("Squeek!");
  }
}
