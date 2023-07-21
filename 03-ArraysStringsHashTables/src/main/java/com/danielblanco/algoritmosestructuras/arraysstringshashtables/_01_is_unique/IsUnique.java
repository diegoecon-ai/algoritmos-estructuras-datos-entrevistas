package com.danielblanco.algoritmosestructuras.arraysstringshashtables._01_is_unique;

/*
 * Dado un método que recibe una String, comprobar si todos los caracteres son únicos o no.
 *
 * isUnique("abcde") => true;
 * isUnique("abcded") => false;
 * a: b c d e 
 * b: c d e
 * c: d e
 * 
 * O(n^2)
 * 
 * Tabla Hash
 * a b c d e
 * 
 * for O(N)
 * Consulta en la tabla O(1)
 * 
 * -----
 * O(1)
 */
public class IsUnique {

  private static NUMBER_OF_CHARS = 128;
  public boolean isUnique(String s) {
    if(s.length() > NUMBER_OF_CHARS) return false;
    
    Set<Character> characters = new HashSet <> ();
    for(Character c : s.toCharArray()) {
      if(characters.contains(c)) return false;
      characters.add(c);
    }
    return true;
  }
}
