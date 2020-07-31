package com.codurance.composite.entities;

public interface MenuComponent {
  default void add(MenuComponent menuComponent){
    throw new UnsupportedOperationException();
  }
  default void remove(MenuComponent menuComponent){
    throw new UnsupportedOperationException();
  }
}
