package com.example.InterviewTestTask.medium.uniq;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Реализуйте функцию uniq(),
 * которая принимает массив чисел и возвращает уникальные числа, найденные в нём.
 * Может ли функция решить эту задачу за время O(N)?
 */
@Slf4j
public class uniq {

    public static void main(String[] args) {
        log.info(uniq(new int[]{}).toString());                                      // []
        log.info(uniq(new int[]{1, 4, 2, 2, 3, 4, 8}).toString());                   // [1, 4, 2, 3, 8]
    }

    private static List uniq(int[] val) {

        return Arrays.stream(val).boxed().distinct().collect(Collectors.toList());

    }

}
