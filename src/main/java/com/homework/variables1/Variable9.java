package com.homework.variables1;

/**
 * Метод main выводит на экран четыре строки. Все они - яркий пример злоупотребления заглавными буквами.
 * Внеси изменения в код, чтобы все буквы в этих строках стали строчными.
 * Требования:
 * •	Не изменяй значения переменных title, degree и career.
 * •	У четырех строк, переданных в метод println, нужно вызвать метод toLowerCase.
 * •	Вывод программы должен содержать четыре строки.
 */

public class Variable9 {

  public static void main(String[] args) {
    // объявляем переменную title типа String и присваиваем ей значение
    String title = "Senior Lead Principal Software Engineer Data Architect";
    // объявляем переменную degree типа String и присваиваем ей значение
    String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
    // объявляем переменную career типа String и присваиваем ей значение
    String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

    // выводим на экран строку "RESUME" в нижнем регистре, полученное
    // с помощью метода toLowerCase
    System.out.println("RESUME".toLowerCase());
    // выводим на экран строку в нижнем регистре, которая образована
    // слиянием строки "TITLE: " и строки из переменной title
    System.out.println(("TITLE: " + title).toLowerCase());
    // выводим на экран строку в нижнем регистре, которая образована
    // слиянием строки "DEGREE: " и строки из переменной degree
    System.out.println(("DEGREE: " + degree).toLowerCase());
    // выводим на экран строку в нижнем регистре, которая образована
    // слиянием строки "CAREER: " и строки из переменной career
    System.out.println(("CAREER: " + career).toLowerCase());
  }
}
