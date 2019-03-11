package com.example.InterviewTestTask.simple.filter;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Создайте собственную реализацию функции filter().
 */
@Slf4j
public class filter {
    public static void main(String[] args) {
        log.info(filter(new int[]{1, 2, 3, 4, 5}, 3).toString());
    }

    /**
     * Fitter array by parametr
     * @param value array for filter
     * @param filter filter value
     * @return new filtered array
     */
    private static List filter(int[] value, int filter) {

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < value.length - 1; i++) {
            if (value[i] < filter)
                integerList.add(value[i]);
        }
        return integerList;
    }
}
