package com.homework.if_else3;

import java.util.Scanner;

/**
 * Есть программа, которая принимает на вход возраст и определяет, нужно в школу или уже пора в институт.
 * Но она работает неправильно. Например, пятилетнего ребенка отправляют в институт! Исправить программу несложно: достаточно в нужном месте поставить фигурные скобки.
 *
 * Требования:
 * •	Программа должна считывать число c клавиатуры.
 * •	Программа должна использовать команду System.out.println() или System.out.print().
 * •	Если возраст меньше 18 и больше либо равен 6, нужно вывести только сообщение "нужно ходить в школу".
 * •	Если возраст больше либо равен 18, нужно вывести только сообщение "пора в институт".
 * •	Если возраст меньше 6, то ничего выводить не нужно.
 */

public class Operator2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    scanner.close();
    if (age < 18 && age > 5) {
        System.out.println("нужно ходить в школу");
    } else if (age > 18){
      System.out.println("пора в институт");
    }
  }
}
