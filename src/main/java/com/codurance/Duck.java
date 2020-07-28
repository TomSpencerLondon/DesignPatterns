package com.codurance;

public abstract class Duck {
  public void quack() {
    System.out.println("Quack");
  }

  public void swim() {
    System.out.println("Look at me I can swim");
  }

  public void fly() {
    System.out.println("Look at me! I am flying!");
  }

  public abstract void display();
}
