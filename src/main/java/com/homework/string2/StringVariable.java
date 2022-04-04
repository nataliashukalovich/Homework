package com.homework.string2;

import java.util.Scanner;

/**
 * Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
 * Требования:
 * •	Программа должна считывать две строки c клавиатуры.
 * •	Если строки одинаковые, то программа должна вывести сообщение "строки одинаковые".
 * •	Если строки разные, то программа должна вывести сообщение "строки разные".
 */

public class StringVariable {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите строку 1 : ");
    String first = scanner.nextLine();
    System.out.print("Введите строку 2 : ");
    String second = scanner.nextLine();

    String result = first.equals(second) ? "строки одинаковые" : "строки разные";
    System.out.println(result);
  }
}
