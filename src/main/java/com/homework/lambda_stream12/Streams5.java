package com.homework.lambda_stream12;

import java.util.stream.Stream;

/**
 * Реализуй метод toUpperCase(Stream<String>) так, чтобы он возвращал поток таких же строк,
 что и во входящем потоке, только в верхнем регистре.
 * Поскольку это будет поток уже других строк, для преобразования используй метод map() объекта типа Stream<String>.
 *
 * Метод main() не принимает участие в тестировании.
 * Требования:
 * •	В публичном статическом методе toUpperCase(Stream<String>) нужно вызывать
 метод map() объекта типа Stream<String>.
 * •	Метод toUpperCase(Stream<String>) нужно реализовать согласно условию.
 */
public class Streams5 {
  public static void main(String[] args) {
    Stream<String> phrase = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");

    toUpperCase(phrase).forEach(System.out::println);
  }

  public static Stream<String> toUpperCase(Stream<String> stream) {
    return stream.map(String::toUpperCase);
  }
}
