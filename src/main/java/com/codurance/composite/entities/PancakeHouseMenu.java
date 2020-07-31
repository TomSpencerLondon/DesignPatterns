package com.codurance.composite.entities;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {

  List<MenuItem> menuItems;

  public PancakeHouseMenu(List<MenuItem> menuItems) {
    this.menuItems = List.copyOf(menuItems);
  }

  @Override
  public Iterator<MenuItem> iterator() {
    return menuItems.iterator();
  }
}
