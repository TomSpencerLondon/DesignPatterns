package com.codurance.singleton;

public class App {

  public static void main(String[] args) {
    Elvis.INSTANCE.leaveTheBuilding();
    Highlander.getInstance().thereCanOnlyBe();
    OfAKind.INSTANCE.oneOfA();
  }
}
