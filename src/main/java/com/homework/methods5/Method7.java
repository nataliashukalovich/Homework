package com.homework.methods5;

import java.util.Scanner;

/**
 * Давай напишем реализацию калькулятора, который будет считать степени чисел.
 * Для этого создай метод cube(). В качестве аргумента он должен принимать целочисленное значение
 * типа long.
 * Метод должен возводить полученное значение в третью степень и возвращать его как результат
 * работы метода.
 * Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать
 * тип long.
 * Требования:
 * •	Должен быть создан метод public static long cube(long).
 * •	Метод cube() должен возвращать результат возведения переданного ему числа в третью степень.
 */


public class Method7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше число : ");
        long number = scanner.nextLong();
        cube(number);
        System.out.println("Число в кубе равно" + " " + cube(number));
    }

    public static long cube(long number) {

        long result = number * number * number;
        return result;
    }
}
