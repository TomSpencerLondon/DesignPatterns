package com.codurance.decorator.entities;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    description = "Dark Roast Coffee";
  }

  @Override
  public double cost() {
    return 1.50;
  }
}
