package com.example.InterviewTestTask.simple.palindrome;


import lombok.extern.slf4j.Slf4j;

/**
 *Реализуйте функцию isPalindrome(), которая возвращает true или false в зависимости от того, является ли переданная ей
 * строка палиндромом (функция нечувствительна к регистру и к наличию в строке пробелов).
 */
@Slf4j
public class palindrome {
    public static void main(String[] args) {

        log.info(String.valueOf(isPalindrome("")));
        log.info(String.valueOf(isPalindrome("abcdcba")));
        log.info(String.valueOf(isPalindrome("abcd")));
        log.info(String.valueOf(isPalindrome("A man a plan a canal Panama")));
    }

    private static Boolean isPalindrome(String value) {
        var v = value.toLowerCase().replace(" ", "").split("");
        if (v.length == 0)
            return true;

        int len = v.length / 2;

        for (int i = 0; i < len; i++) {
            if (!(v[i].equals(v[v.length - 1 - i])))
                return false;
        }
        return true;
    }
}
