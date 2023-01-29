package com.danielblanco.algoritmosestructuras.tries._02_word_search;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class WordSearchTest {

  @Test
  public void wordSearchTest() {
    WordSearch wordSearch = new WordSearch();

    char[][] board =
        new char[][] {
          new char[] {'p', 'e', 'r', 'o'},
          new char[] {'a', 't', 'a', 'e'},
          new char[] {'t', 'e', 'l', 'v'},
          new char[] {'o', 'f', 'l', 'v'}
        };
    String[] words = new String[] {"pero", "pato", "comida", "veo"};
    assertArrayEquals(
        new String[] {"pero", "pato", "veo"}, wordSearch.findWords(board, words).toArray());
  }
}
