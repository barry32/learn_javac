package com.sun.tools.javac;

import java.lang.annotation.Documented;
import java.lang.annotation.Native;

/**
 * @Description
 * @Author Barry
 * @create: 2020-10-21 23:39
 **/
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        test();
    }

    @Deprecated
    static void test() {
        System.out.println("test!");
    }

}
