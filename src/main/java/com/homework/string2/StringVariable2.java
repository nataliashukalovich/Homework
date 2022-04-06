package com.homework.string2;

import java.util.Scanner;

/**
 * Напиши программу, которая будет сравнивать введенную строку со строкой из переменной secret, не учитывая регистр.
 * Если введенная строка равна строке из переменной secret, программа выводит на экран сообщение "доступ разрешен". В ином случае - "доступ запрещен".
 * Требования:
 * •	Программа должна считывать строку c клавиатуры.
 * •	В классе StringVariable2 должна быть публичная статическая переменная secret типа String.
 * •	Если введенная строка и строка из переменной secret одинаковые, не учитывая регистр, то программа должна вывести сообщение "доступ разрешен".
 * •	Если введенная строка и строка из переменной secret разные, не учитывая регистр, то программа должна вывести сообщение "доступ запрещен".
 */

/*
Сломанная клавиатура
*/

public class StringVariable2 {
  public static String secret = "AmIGo";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите строку : ");
    String second = scanner.nextLine();

    String result = second.equals(secret) ? "доступ разрешен" : "доступ запрещен";
    System.out.println(result);
    }
  }

