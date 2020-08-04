package com.codurance.factory.simple.entities;

public class HawaiianPizza extends Pizza {

  @Override
  public void eat() {
    System.out.println("Aloha!");
  }

  @Override
  public void prepare() {
    System.out.println("Get the pineapples!");
  }

}
