package com.codurance.decorator.entities;

public class Espresso extends Beverage{

  public Espresso() {
    description = "Small cup - strong hit!";
  }

  @Override
  public double cost() {
    return 1.50;
  }
}
