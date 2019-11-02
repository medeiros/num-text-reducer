package com.arneam.numtextreducer.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TextReducer {

  private static TextReducer instance;

  public static TextReducer instance() {
    if (instance == null) {
      instance = new TextReducer();
    }
    return instance;
  }

  public int reduceToNumber(final String name) {
    int num = name.toUpperCase().chars().map(c -> convertToValue((char) c))
        .reduce(0, Integer::sum);
    return num % 9 == 0 ? 9 : num % 9;
  }

  int convertToValue(final char character) {
    return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(character) % 9 + 1;
  }

}
