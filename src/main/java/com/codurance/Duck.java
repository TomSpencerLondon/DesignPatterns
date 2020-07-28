package com.codurance;

public abstract class Duck implements Flyable {
  public void quack() {
    System.out.println("Quack");
  }

  public void swim() {
    System.out.println("Look at me I can swim");
  }

  public abstract void display();
}
