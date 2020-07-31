package com.codurance.composite.entities;

public class Waitress {

  private final MenuComponent menu;

  public Waitress(MenuComponent menu) {
    this.menu = menu;
  }

  public void sayMenu() {
    System.out.println("Hey darling. This is our composed menu: ");
    System.out.println(menu);
  }
}
