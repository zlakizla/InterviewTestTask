package com.example.InterviewTestTask.simple.primeNumber;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/**
 * Реализуйте функцию isPrime(), которая возвращает true или false, указывая, является ли переданное ей число простым.
 */
@Slf4j
public class prime {
    public static void main(String[] args) {
        int q = 13, w = 12, e = 5, r = 41;
        log.info(q + " is " + isPrime(q).toString());
        log.info(w + " is " + isPrime(w).toString());
        log.info(e + " is " + isPrime(e).toString());
        log.info(r + " is " + isPrime(r).toString());
    }

    private static Boolean isPrime(@NonNull int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
