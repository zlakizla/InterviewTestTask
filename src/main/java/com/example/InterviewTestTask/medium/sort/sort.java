package com.example.InterviewTestTask.medium.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Создайте реализацию функции sort(), которая сортирует числовой массив за время O(N×log(N)).
 */
@Slf4j
public class sort {
    public static void main(String[] args) {
        log.info(sort(new int []{}).toString());
        log.info(sort(new int[]{-4, 1, 3, 3, 0}).toString());
    }

    private static List sort(int[] val) {
        return Arrays.stream(val).boxed().sorted().collect(Collectors.toList());
    }
}
