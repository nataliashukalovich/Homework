package com.homework.variables1;

/**
 * В переменную hugeAmount нужно записать число 100500.
 * Используй переменные bigAmount, greatAmount и преобразование строки в число.
 * Для объявления и инициализации hugeAmount используй одну команду.
 * Требования:
 * •	Не изменяй значения переменных bigAmount и greatAmount.
 * •	Для инициализации переменной hugeAmount используй bigAmount, greatAmount и метод Integer.parseInt(String).
 * •	Программа должна выводить на экран переменную hugeAmount.
 */

public class Variable7 {

  public static void main(String[] args) {
    // объявляем переменную bigAmount типа String и присваиваем ей значение
    String bigAmount = "500";
    // объявляем переменную greatAmount типа String и присваиваем ей значение
    String greatAmount = "100000";

    // объявляем переменную hugeAmount типа int и присваиваем ей значение
    // суммы чисел из переменных bigAmount и greatAmount предварительно
    // преобразованных из строк с помощью метода parseInt класса Integer
    int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount);

    // выводим на экран значение переменной hugeAmount
    System.out.println(hugeAmount);
  }
}
