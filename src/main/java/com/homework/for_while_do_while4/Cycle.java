package com.homework.for_while_do_while4;

/**
 * Используя цикл while вывести на экран сто раз цитату (переменная quote):
 * «Я никогда не буду работать за копейки. Амиго»
 *
 * Каждое значение вывести с новой строки.
 * Требования:
 * •	Программа должна выводить текст на экран.
 * •	Программа должна выводить на экран 100 раз содержимое переменной quote.
 * •	В программе необходимо использовать цикл while.
 */

public class Cycle {

  public static void main(String[] args) {
    String quote = "Я никогда не буду работать за копейки. Амиго";
    int number = 100;
    int i = 0;

    while (i < number) {
      System.out.println(quote);
      i++;
    }

  }
}

