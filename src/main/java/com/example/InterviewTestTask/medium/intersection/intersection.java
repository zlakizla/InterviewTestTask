package com.example.InterviewTestTask.medium.intersection;

import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Slf4j
public class intersection {
    public static void main(String[] args) {
        log.info(intersection(new int[]{1, 5, 4, 2}, new int[]{8, 91, 4, 1, 3}).toString());      // [4, 1]
        log.info(intersection(new int[]{1, 5, 4, 2}, new int[]{7, 12}).toString());              // []
    }

    private static List intersection(int[] val1, int[] val2) {
        return Arrays.stream(val1).filter(x -> Arrays.stream(val2).
                anyMatch(y -> y == x)).boxed().collect(Collectors.toList());
    }
}
