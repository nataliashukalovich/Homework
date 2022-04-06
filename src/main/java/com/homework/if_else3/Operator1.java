package com.homework.if_else3;

import java.util.Scanner;

/**
 * Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
 * то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.
 * <p>
 * Пример ввода:
 * Amigo
 * 18
 * Пример вывода:
 * Amigo, явитесь в военкомат
 * Требования:
 * •	Программа должна считывать данные с клавиатуры два раза.
 * •	Программа должна использовать команду System.out.println() или System.out.print().
 * •	Если возраст в пределах 18-28 (включительно), то вывести только сообщение "Имя, явитесь в военкомат".
 * •	Если возраст не находится в указанных пределах, то ничего выводить не нужно.
 */

public class Operator1 {

    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя : ");
        String name = scanner.nextLine();
        System.out.println("Введите ваш возраст : ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 28) {
            System.out.println(name + militaryCommissar);
        } else {
        }
    }
}
