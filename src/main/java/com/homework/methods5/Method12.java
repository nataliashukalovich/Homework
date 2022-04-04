package com.homework.methods5;

/**
 * Программа должна выводить количество населения самых крупных городов мира и
 сравнивать их с самым большим городом — Токио.
 * Но алгоритм программы немного нарушен. Для исправления ошибки тебе необходимо сделать так,
 чтобы в строке с выводом информации о самом крупном городе мира использовались
 статические переменные класса вместо локальных аргументов метода.
 *
 * При правильной работе программы вывод должен быть следующим:
 * Население города Джакарта составляет 25.3 млн человек.
 * В то время как в самом густонаселенном городе Токио население составляет 34.5 млн человек.
 * Население города Сеул составляет 25.2 млн человек.
 * В то время как в самом густонаселенном городе Токио население составляет 34.5 млн человек.
 * Население города Дели составляет 23.1 млн человек.
 * В то время как в самом густонаселенном городе Токио население составляет 34.5 млн человек.
 * Население города Нью-Йорк составляет 21.6 млн человек.
 * В то время как в самом густонаселенном городе Токио население составляет 34.5 млн человек.
 *
 *
 * Требования:
 * •	Изменять имена переменных нельзя.
 * •	Для вывода информации о самом крупном городе должны использоваться статические переменные
 класса city и population.
 * •	Вывод программы в консоли должен соответствовать условию задачи.
 */


public class Method12 {
  public static String city1 = "Токио";
  public static String city2 = "Джакарта";
  public static String city3 = "Дели";
  public static String city4 = "Нью-Йорк";
  public static String city5 = "Сеул";

  public static double population1 = 34.5;
  public static double population2 = 25.3;
  public static double population3 = 23.1;
  public static double population4 = 21.6;
  public static double population5 = 25.2;

  public static void main(String[] args) {
    printCityPopulationJakarta("Джакарта", 25.3);
    printCityPopulationDelhi("Дели", 23.1);
    printCityPopulationNewyork("Нью-Йорк", 21.6);
    printCityPopulationSeoul("Сеул", 25.2);
  }

  public static void printCityPopulationJakarta(String city2, double population2){
    System.out.println("Население города " + city2 + " составляет " + population2 + " млн человек.");
    System.out.println("В то время как в самом густонаселенном городе " + city1 + " население составляет " + population1 + " млн человек.");
  }
  public static void printCityPopulationDelhi(String city3, double population3){
    System.out.println("Население города " + city3 + " составляет " + population3 + " млн человек.");
    System.out.println("В то время как в самом густонаселенном городе " + city1 + " население составляет " + population1 + " млн человек.");
  }
  public static void printCityPopulationNewyork(String city4, double population4){
    System.out.println("Население города " + city4 + " составляет " + population4 + " млн человек.");
    System.out.println("В то время как в самом густонаселенном городе " + city1 + " население составляет " + population1 + " млн человек.");
  }
  public static void printCityPopulationSeoul(String city5, double population5){
    System.out.println("Население города " + city5 + " составляет " + population5 + " млн человек.");
    System.out.println("В то время как в самом густонаселенном городе " + city1 + " население составляет " +  population1 + " млн человек.");
}
}

