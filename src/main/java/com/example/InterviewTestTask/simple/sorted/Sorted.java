package com.example.InterviewTestTask.simple.sorted;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Sorted {
    public static void main(String[] args) {
        log.info(isSorted(new int[]{}).toString());
        log.info(isSorted(new int[]{-5, 0, 3, 9}).toString());
        log.info(isSorted(new int[]{2, 1}).toString());
    }

    private static Boolean isSorted(int[] array) {

        if (array.length == 0)
            return true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i])
                return false;
        }
        return true;
    }
}
