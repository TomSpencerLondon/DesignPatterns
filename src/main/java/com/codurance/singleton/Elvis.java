package com.codurance.singleton;

public class Elvis {

  public static final Elvis INSTANCE = new Elvis();

  private Elvis() {
  }

  public void leaveTheBuilding() {
    System.out.println("Elvis has left the building!");
  }
}
