package com.codurance.singleton;

public class Highlander {
  private static final Highlander INSTANCE = new Highlander();

  private Highlander(){ }

  public static Highlander getInstance(){
    return INSTANCE;
  }

  public void thereCanOnlyBe(){
    System.out.println("There can only be one Highlander!");
  }
}
