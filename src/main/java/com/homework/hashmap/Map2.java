package com.homework.hashmap;

import java.util.HashMap;

/**
 * В классе Map2 есть метод getProgrammingLanguages,
 который возвращает список языков программирования. Тебе нужно переписать этот метод,
 чтобы он возвращал HashMap<Integer, String>.
 * Ключом в этой коллекции будет индекс элемента в ArrayList.
 * Требования:
 * •	В классе Map2 должен быть публичный статический метод getProgrammingLanguages с типом возвращаемого значения HashMap<Integer, String>.
 * •	Метод getProgrammingLanguages() должен возвращать HashMap заполненным в соответствии с списком.
 */

public class Map2 {

  public static HashMap<Integer, String> ProgrammingLanguages = new HashMap<>();

  public static void main(String[] args) {
    getProgrammingLanguages();
    System.out.println(ProgrammingLanguages);
  }

  public static void getProgrammingLanguages() {
    ProgrammingLanguages.put(0, "Java");
    ProgrammingLanguages.put(1, "Kotlin");
    ProgrammingLanguages.put(2, "Go");
    ProgrammingLanguages.put(3, "Javascript");
    ProgrammingLanguages.put(4, "Typescript");
    ProgrammingLanguages.put(5, "Python");
    ProgrammingLanguages.put(6, "PHP");
    ProgrammingLanguages.put(7, "C++");
  }
}
