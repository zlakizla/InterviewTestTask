package com.example.InterviewTestTask.simple.balanced;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Slf4j
public class isBalansed {

    public static void main(String[] args) {
        log.info(String.valueOf(isBalanced("}{")));
        log.info(String.valueOf(isBalanced("{{}")));
        log.info(String.valueOf(isBalanced("{}{}")));
        log.info(String.valueOf(isBalanced("foo { bar { baz } boo }")));
        log.info(String.valueOf(isBalanced("foo { bar { baz }")));
        log.info(String.valueOf(isBalanced("foo { bar } }")));
    }

    private static Boolean isBalanced(String value) {

        var list = new ArrayList<String>();
        var array = value.split("");

        for (String s : array) {
            if (s.equals("{"))
                list.add("{");
            try {
                if (s.equals("}"))
                    list.remove(list.size() - 1);

            } catch (Exception e) {
                return false;
            }
        }
        if (list.isEmpty())
            return true;
        else
            return false;
    }
}