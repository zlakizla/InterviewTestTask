package com.example.InterviewTestTask.medium.fibonachi;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;

/**
 * Реализуйте функцию fib2(). Она похожа на функцию fib()
 * из предыдущей группы заданий, но поддерживает числа вплоть до 50. Подсказка: используйте мемоизацию.
 */
@Slf4j
public class fibonachi {
    public static void main(String[] args) {
        log.info(String.valueOf(fibonachi(0)));  // 0
        log.info(String.valueOf(fibonachi(1))); // 1
        log.info(String.valueOf(fibonachi(10)));// 55
        log.info(String.valueOf(fibonachi(50)));// 12586269025
    }

    private static Long fibonachi(int value) {
        if (value == 0)
            return 0L;
        var list = new LinkedList<>(Arrays.asList(0L, 1L));

        for (int i = 2; i <= value; i++) {
            long current = list.getLast();
            long prev = list.get(list.size() - 2);
            list.add(current + prev);
        }
        return list.getLast();
    }
}
