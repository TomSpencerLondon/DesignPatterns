package com.codurance.decorator.entities;

public class HouseBlend extends Beverage{

  public HouseBlend() {
    description = "House blend!";
  }

  @Override
  public double cost() {
    return 1.00;
  }
}
