package com.codurance;

public class RedheadDuck extends Duck implements Flyable{
  @Override
  public void display(){
    System.out.println("I look like a Redhead!");
  }

  @Override
  public void fly() {
    System.out.println("I am flying! I am a redhead!");
  }
}
