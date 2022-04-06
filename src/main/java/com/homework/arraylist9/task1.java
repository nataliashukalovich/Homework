package com.homework.arraylist9;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class task1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "World", "Java");
        list.forEach(System.out::println);
    }
}
