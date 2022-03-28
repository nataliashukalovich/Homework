package com.homework.variables1;

/**
 * В методе main на экран выводятся значения трех строк.
 * Внеси изменения в код, чтобы вместо значений строк вывелась длина каждой строки.
 * Требования:
 * •	Не изменяй значение переменной emptyString.
 * •	У трех строк, переданных в метод println, нужно вызвать метод length.
 * •	Программа должна вывести на экран три числа, каждое - с новой строки.
 */

public class Variable8 {

  public static void main(String[] args) {
    // объявляем переменную emptyString типа String и присваиваем ей
    // значение - пустую строку ""
    String emptyString = "";

    // выводим на экран значение длины строки из переменной emptyString,
    // полученное с помощью метода length
    System.out.println(emptyString.length());
    // выводим на экран значение длины строки "Gomu Gomu no Bazooka!",
    // полученное с помощью метода length
    System.out.println("Gomu Gomu no Bazooka!".length());
    // выводим на экран значение длины строки, полученной в результате
    // слияния строк и чисел emptyString + 2 + 2 + "22" при этом числа
    // будут преобразованы в строки перед соединением
    System.out.println((emptyString + 2 + 2 + "22").length());
  }
}
