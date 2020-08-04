package com.codurance.factory.simple.entities;

public class VeggiePizza extends Pizza {

  @Override
  public void eat() {
    System.out.println("Veggie! Good for you! No really!");
  }

  @Override
  public void prepare() {
    System.out.println("Chop the veggies!");
  }
}
