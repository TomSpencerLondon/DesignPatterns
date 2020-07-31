package com.codurance.composite.entities;

public class MenuItem implements MenuComponent {
  private final String name;
  private final double price;
  private final String description;


  public MenuItem(String name, double price, String description) {
    this.name = name;
    this.price = price;
    this.description = description;
  }

  @Override
  public String toString() {
    return name +
        ", price: " + price +
        ", description: " + description;
  }
}
