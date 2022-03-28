package com.homework.arraylist9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * В классе List10 объявлены методы: reverse(ArrayList<Integer>), sort(ArrayList<Integer>), rotate(ArrayList<Integer>, int), shuffle(ArrayList<Integer>). Тебе нужно разобраться, что делают методы, переписать их реализацию, используя при этом только соответствующие методы класса Collections.
 * Требования:
 * •	В классе List10 должен быть публичный статический метод reverse(ArrayList<Integer>) с типом возвращаемого значения void.
 * •	В классе List10 должен быть публичный статический метод sort(ArrayList<Integer>) с типом возвращаемого значения void.
 * •	В классе List10 должен быть публичный статический метод rotate(ArrayList<Integer>, int) с типом возвращаемого значения void.
 * •	В классе List10 должен быть публичный статический метод shuffle(ArrayList<Integer>) с типом возвращаемого значения void.
 * •	Метод reverse(ArrayList<Integer>) нужно переписать, используя метод reverse класса Collections.
 * •	Метод sort(ArrayList<Integer>) нужно переписать, используя метод sort класса Collections.
 * •	Метод rotate(ArrayList<Integer>, int) нужно переписать, используя метод rotate класса Collections.
 * •	Метод shuffle(ArrayList<Integer>) нужно переписать, используя метод shuffle класса Collections.
 */

public class List10 {
  public static void reverse(ArrayList<Integer> list) {
    Collections.reverse(list);
  }

  public static void sort(ArrayList<Integer> list) {
    Collections.sort(list);
  }

  public static void rotate(ArrayList<Integer> list, int distance) {
    Collections.rotate(list, distance);
  }

  public static void shuffle(ArrayList<Integer> list) {
    Collections.shuffle(list);
  }
}
