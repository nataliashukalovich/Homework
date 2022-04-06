package com.homework.oop7.interfaces.solution.task5Music;

import java.util.ArrayList;
import java.util.List;

/**
 * В деревне Вилларибо есть струнный оркестр, а в деревне Виллабаджо — клавишный.
 * Как-то раз повозки с музыкантами из двух деревень столкнулись на перекрестке, и все смешалось в кучу.
 * Помоги артистам разобрать свои инструменты. И естественно, после этого оба оркестра должны дать концерт.
 * <p>
 * Для этого:
 * <p>
 * в методе createKeyboardOrchestra() добавь в список orchestra один орган и три пианино;
 * в методе createStringedOrchestra() добавь в список orchestra две скрипки и одну гитару;
 * метод playOrchestra() должен вызывать метод play() у всех элементов списка orchestra.
 * Требования:
 * •	Метод createKeyboardOrchestra() должен добавлять в список orchestra один объект класса
 * Organ и три объекта Piano.
 * •	Метод createStringedOrchestra() должен добавлять в список orchestra два объекта класса
 * Violin и один объект Guitar.
 * •	Метод playOrchestra() должен вызывать метод play() у всех элементов списка orchestra.
 */

public class Solution {
    static List<MusicalInstrument> string = new ArrayList<>();

    static List<MusicalInstrument> key = new ArrayList<>();


    public static void main(String[] args) {
        createKeyboardOrchestra();
        playOrchestra(key);

        createStringedOrchestra();
        playOrchestra(string);
    }

    public static void createKeyboardOrchestra() {
        key.add(new Piano());
        key.add(new Organ());
    }

    public static void createStringedOrchestra() {
        string.add(new Guitar());
        string.add(new Violin());
    }

    public static void playOrchestra(List<MusicalInstrument> orchestra) {
        for (MusicalInstrument instrument : orchestra) {
            instrument.play();
        }
    }
}
