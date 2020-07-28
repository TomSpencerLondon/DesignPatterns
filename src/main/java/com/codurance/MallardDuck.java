package com.codurance;

public class MallardDuck extends Duck implements Flyable{
  @Override
  public void display(){
    System.out.println("I look like a mallard!");
  }

  @Override
  public void fly() {
    System.out.println("I am flying! I am a mallard!");
  }
}
