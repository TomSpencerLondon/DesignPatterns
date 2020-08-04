package com.codurance.factory.simple.entities;

public class PepperoniPizza extends Pizza {

  @Override
  public void eat() {
    System.out.println("My favorite! Pepperoni!");
  }

  @Override
  public void prepare() {
    System.out.println("Cut the pepperoni!");
  }
}
