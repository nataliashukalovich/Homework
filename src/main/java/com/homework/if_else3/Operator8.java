package com.homework.if_else3;

import java.util.Scanner;

/**
 * Эта программа написана с использованием тернарного оператора, но не совсем понятно, что она делает.
 * Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
 * Перепиши программу без использования тернарного оператора.
 * Требования:
 * •	Программа должна считывать число c клавиатуры.
 * •	Вместо тернарного оператора в программе должен быть использован оператор if.
 * •	Функционал программы не должен измениться.
 */

public class Operator8 {
  static final int NUMBER_EXPECTED = 5;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число : ");
    int number = scanner.nextInt();

    if (number < NUMBER_EXPECTED){
      System.out.printf("Число меньше %d%n", NUMBER_EXPECTED);
    }
    else if (number > NUMBER_EXPECTED){
      System.out.printf("Число больше %d%n", NUMBER_EXPECTED);
    }
    else {
      System.out.printf("Число равно %d%n", NUMBER_EXPECTED);
    }
  }
}
