package com.arneam.numtextreducer.domain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TextReducerTest {

  @ParameterizedTest
  @CsvSource(value = {"A, 1", "B, 2", "O, 6", "L, 3", "R, 9", "S, 1", "V, 4"})
  void shouldConvertCharToValue(char character, int value) {
    assertThat(TextReducer.instance().convertToValue(character), is(equalTo(value)));
  }

  @ParameterizedTest
  @CsvSource(value = {"Daniel, 9", "Maria, 6"})
  void shouldReduceToNumber(String name, int number) {
    assertThat(TextReducer.instance().reduceToNumber(name), is(equalTo(number)));
  }

}
