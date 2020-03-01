package com.myyizhan.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class HelloWorld3 {

    private static final HelloWorld H = new HelloWorld();

    /**
     *
     */
    public static final  HelloWorld H1 = new HelloWorld();

    // 模板1：psvm
    public static void main(String[] args) {

        // 模板2：sout
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld3.main");
        int k = 0;
        int q = 1;
        System.out.println("q = " + q);
        System.out.println(k);

        String[] name = new String[]{"张三", "李四", "王五"};
        String[] name2 = new String[]{"张三", "李四", "王五"};
        System.out.println("name2 = " + name2);

        List<String> list1 = new ArrayList<String>();
        if (list1 == null) {

        }
        if (list1 != null) {

        }

    }

    public void methodTest(String a, Integer b) {

    }

}
