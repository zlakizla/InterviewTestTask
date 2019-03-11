package com.example.InterviewTestTask.medium.includes;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Реализуйте функцию includes(), которая возвращает true или
 * false в зависимости от того, встречается ли переданное ей число
 * в переданном ей отсортированном массиве. Может ли функция решить
 * эту задачу за время O(log(N))?
 */
@Slf4j
public class inludes {
    public static void main(String[] args) {
        log.info(includes(new int[]{1, 3, 8, 10}, 8).toString());           // true
        log.info(includes(new int[]{1, 3, 8, 8, 15}, 15).toString());       // true
        log.info(includes(new int[]{1, 3, 8, 10, 15}, 9).toString());       //false
    }

    private static Boolean includes(int[] ints, int i) {
        return Arrays.stream(ints).boxed().anyMatch(q -> q == i);
    }
}
