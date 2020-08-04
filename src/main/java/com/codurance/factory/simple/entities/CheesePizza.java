package com.codurance.factory.simple.entities;

public class CheesePizza extends Pizza {

  @Override
  public void eat() {
    System.out.println("Tangy cheese! Delicious!");
  }

  @Override
  public void prepare() {
    System.out.println("Sprinkle the cheese!");
  }
}
