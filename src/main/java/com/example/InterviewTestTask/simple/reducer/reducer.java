package com.example.InterviewTestTask.simple.reducer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * Создайте собственную реализацию функции reduce().
 */
@Slf4j
public class reducer {
    public static void main(String[] args) {

        log.info("function reduce: "+reduce(new int[]{1, 2, 3, 4}));
    }

    private static long reduce(int[] value) {

        long result = 0;
        for (int i = 0; i < value.length; i++) {
            result = result + value[i];
        }
        return result;

    }
}
