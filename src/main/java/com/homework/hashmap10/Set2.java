package com.homework.hashmap10;

import java.util.HashSet;

import static java.util.Arrays.asList;

/**
 * В классе Set2 есть метод checkWords(String), который должен проверять наличие переданного слова в множестве words.
 * Если слово есть, то выводим в консоль:
 * Слово [переданное слово] есть в множестве
 * Если нет:
 * Слова [переданное слово] нет в множестве
 *
 * Метод main не участвует в проверке.
 *
 * Пример вывода:
 * Слово Java есть в множестве
 * Требования:
 * •	В классе Set2 должно быть публичное статическое поле words типа HashSet<String>.
 * •	В классе Set2 должен быть публичный статический метод checkWords(String) с типом возвращаемого значения void.
 * •	Метод checkWords(String) должен работать согласно условию.
 */

public class Set2 {

  public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));
  private static final String CONTAINS_TEMPLATE = "Слово %s есть в множестве";
  private static final String NOT_CONTAINS_TEMPLATE = "Слово %s отсутствует в множестве";


  public static void main(String[] args) {
    checkWords("JavaScript");
    checkWords("Java");
  }
  public static void checkWords(String word) {
    System.out.println(words.contains(word) ?
            String.format(CONTAINS_TEMPLATE, word) :
            String.format(NOT_CONTAINS_TEMPLATE, word));
  }
}
