package com.homework.for_while_do_while4;

import java.util.Scanner;

/**
 * Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
 * Вывести на экран полученную сумму и завершить программу.
 * Требования:
 * •	Программа должна считывать данные c клавиатуры.
 * •	Программа должна выводить данные на экран, если пользователь ввел слово "ENTER".
 * •	Необходимо посчитать сумму введенных целых чисел и вывести её на экран.
 * •	В программе необходимо использовать цикл while.
 */

public class Cycle2 {

    public static void main(String[] args) {

        String stopWord = "Enter";
        String input = "";
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число : ");
            input = scanner.nextLine();
            if (input.equals(stopWord)) {
                break;
            }
            sum += Integer.parseInt(input);
        }

        System.out.println(sum);
    }
}

