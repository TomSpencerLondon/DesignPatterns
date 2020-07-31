package com.codurance.iterator.entities;

import static java.util.Arrays.asList;

import java.util.Iterator;
import java.util.List;

public class DinerMenu implements Menu {
  MenuItem[] menuItems;

  public DinerMenu(List<MenuItem> menuItems) {
    MenuItem[] result = new MenuItem[menuItems.size()];
    this.menuItems = menuItems.toArray(result);
  }

  @Override
  public Iterator<MenuItem> iterator() {
    return asList(menuItems).iterator();
  }
}
