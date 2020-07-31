package com.codurance.composite.entities;

public class Waitress {

  private final Menu pancakeHouseMenu;
  private final Menu dinerMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
  }

  public void sayMenu() {
    System.out.println("Hey darling. This is our combined menu: ");
    pancakeHouseMenu.forEach(System.out::println);
    dinerMenu.forEach(System.out::println);
  }
}
