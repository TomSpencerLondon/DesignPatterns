package com.codurance.observer;

import com.codurance.observer.entities.NewsReader;
import com.codurance.observer.entities.Newspaper;
import com.codurance.observer.entities.Observer;
import java.util.List;

public class App {

  public static void main(String[] args) {
    Newspaper newsPaper = new Newspaper();

    List<Observer> newsReaders = List.of(
        new NewsReader(newsPaper),
        new NewsReader(newsPaper),
        new NewsReader(newsPaper),
        new NewsReader(newsPaper),
        new NewsReader(newsPaper)
    );
    newsPaper.notifyObservers();
    newsPaper.setHeadline("Rival yoga gurus clash");
    newsPaper.setHeadline("Drunk fought invisible man");
  }
}
