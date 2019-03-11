package com.example.InterviewTestTask.simple.indexOf;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Создайте собственную реализацию функции indexOf() для массивов.
 */
@Slf4j
public class indexOf {
    public static void main(String[] args) {
        log.info(String.valueOf(indexOf(new int[]{1, 2, 3}, 1)));
        log.info(String.valueOf(indexOf(new int[]{1, 2, 3}, 5)));
    }


    private static int indexOf(int[] array, int value) {
        var t = Arrays.stream(array).anyMatch(q -> q == value);
        if (t)
            return 0;
        else
            return -1;


    }
}
