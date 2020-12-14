package com.gd;

import java.sql.SQLOutput;

/**
 * @description TODO
 * author: liquan
 * date: 2020/11/26 09:49
 * version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        test01();
    }

    public static void test01() {
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("11");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }

    public static void test02() {
        String s = new String("1");
        String s2 = "1";
        s.intern();
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        String s4 = "11";
        s3.intern();
        System.out.println(s3 == s4);
    }
}
