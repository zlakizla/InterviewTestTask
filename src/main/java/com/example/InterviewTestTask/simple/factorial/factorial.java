package com.example.InterviewTestTask.simple.factorial;

import lombok.extern.slf4j.Slf4j;

/**
 * Реализуйте функцию factorial(), которая возвращает факториал переданного ей числа.
 */
@Slf4j
public class factorial {
    public static void main(String[] args) {
        log.info("factorial 5 is " + factorial(5));
        log.info("factorial 10 is " + factorial(10));
        log.info("factorial 12 is " + factorial(12));
        log.info("factorial 15 is " + factorial(15));
    }

    private static long factorial(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}

