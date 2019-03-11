package com.example.InterviewTestTask.simple.reverse;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * Реализуйте функцию reverse(), которая обращает
 * порядок следования символов переданной ей строки. Не пользуйтесь встроенной функцией reverse().
 */
@Slf4j
public class reverce {
    public static void main(String[] args) {
        log.info(reverce(""));
        log.info(reverce("abcdef"));
    }

    private static String reverce(String value) {

        var array = value.split("");
        var arrayList = new ArrayList();

        for (int i = array.length - 1; i >= 0; i--) {
            arrayList.add(array[i]);
        }
        return arrayList.toString();
    }
}
