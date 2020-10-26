package com.sun.tools.javac;


import com.sun.org.glassfish.gmbal.Description;

import java.lang.annotation.Documented;
import java.lang.annotation.Native;

/**
 * @Description
 * @Author Barry
 * @create: 2020-10-21 23:39
 **/
@Description(value = "java")
public class HelloWorld extends HHH{

    public HelloWorld() {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i =0;
        System.out.println(10/i);
        test();
    }

    @Deprecated
    static void test() {
        System.out.println("test!");
    }


    class TestA{

        int i = 19;
    }
}

class TestB{

    int i = 19;
}
