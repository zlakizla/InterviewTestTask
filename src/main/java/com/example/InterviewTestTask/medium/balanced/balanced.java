package com.example.InterviewTestTask.medium.balanced;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Реализуйте функцию isBalanced2().
 * Она похожа на функцию isBalanced() из предыдущей группы заданий,
 * но поддерживает три типа скобок: фигурные {}, квадратные [], и круглые ().
 * При передаче функции строки, в которой имеются неправильные скобочные последовательности,
 * функция должна возвращать false.
 */
@Slf4j
public class balanced {
    public static void main(String[] args) {

        log.info(balanced("(foo { bar (baz) [boo] })").toString()); // true
        log.info(balanced("foo { bar { baz }").toString());         // false
        log.info(balanced("foo { (bar [baz] } )").toString());      // false

    }

    private static Boolean balanced(String value) {

        var array = value.replace(" ", "").split("");
        var stack = new LinkedList<>();

        for (var item : array) {
            if (item.equals("{") || item.equals("(") || item.equals("["))
                stack.add(item);
            try {
                if (item.equals("}") || item.equals("]") || item.equals(")")) {
                    if (stack.getLast().equals("{") && item.equals("}"))
                        stack.removeLast();
                    if (stack.getLast().equals("[") && item.equals("]"))
                        stack.removeLast();
                    if (stack.getLast().equals("(") && item.equals(")"))
                        stack.removeLast();
                }

            } catch (Exception e) {
                log.info("Exception");
                return false;
            }
        }

        if (stack.isEmpty())
            return true;
        else
            return false;


    }

}
