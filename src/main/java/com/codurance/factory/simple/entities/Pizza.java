package com.codurance.factory.simple.entities;

public abstract class Pizza {
  public abstract void eat();
  public abstract void prepare();
  public void bake(){
    System.out.println("stick in the oven!");
  }
  public void cut(){
    System.out.println("Pizza cutter!");
  }
  public void box(){
    System.out.println("Box it up!");
  }
}
