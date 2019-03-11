package com.example.InterviewTestTask.simple.fibonachi;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * Реализуйте функцию fib(), возвращающую n-ное число Фибоначчи.
 */
@Slf4j
public class fibonachi {
    public static void main(String[] args) {
        log.info("" + fibonachi(8));
    }

    private static long fibonachi(long number) {
        ArrayList<Integer> arrayList = new ArrayList();

        arrayList.add(0);
        arrayList.add(1);
        for (int i = 2; i <= number; i++) {
            Integer current = arrayList.get(arrayList.size() - 1) +
                    arrayList.get(arrayList.size() - 2);
            arrayList.add(current);
        }

        return Long.parseLong(arrayList.stream().reduce((a, b) -> b).orElse(0).toString());
    }
}
