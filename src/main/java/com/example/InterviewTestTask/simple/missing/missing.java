package com.example.InterviewTestTask.simple.missing;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Реализуйте функцию missing(), которая принимает неотсортированный массив уникальных чисел
 * (то есть, числа в нём не повторяются) от 1 до некоего числа n, и возвращает число, отсутствующее
 * в последовательности. Там может быть либо одно отсутствующее число, либо их может не быть вовсе.
 * <p>
 * Способны ли вы добиться того, чтобы функция решала задачу за время O(N)?
 * Подсказка: есть одна хорошая формула, которой вы можете воспользоваться.
 */
@Slf4j
public class missing {
    public static void main(String[] args) {

        log.info(missing(new int[]{}));
        log.info(missing(new int[]{1, 4, 3}));
        log.info(missing(new int[]{2, 3, 4}));
        log.info(missing(new int[]{5, 1, 4, 2}));
        log.info(missing(new int[]{1, 2, 3, 4}));
    }

    private static String missing(int[] value) {

        var array = Arrays.stream(value).boxed().sorted().collect(Collectors.toList());

        int currentVal = 1;

        for (int i = 0; i < array.size() - 1; i++) {
            if (!(array.get(i).equals(currentVal))) {
                return String.valueOf(currentVal);
            }
            currentVal++;
        }

        return "";
    }
}
