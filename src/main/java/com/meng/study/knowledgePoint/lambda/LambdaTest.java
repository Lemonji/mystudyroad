package com.meng.study.knowledgePoint.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    /*
    lambda表达式它必须用于函数式接口
    即这个接口只能有抽象的方法
     */
    Runnable r = () -> System.out.println("running");
   /*
   lambda表达式：左边的的Runnable为接口名称，
   ->表示此为lambda表达式，
   箭头右边为表达式主体，主体同时也是返回值，如果函数定义时为void，就没有返回
   有些函数需要参数，那么在箭头左边括号里给它加上
    */

    /*
    测试一下自定义的函数式接口
     */
    lambdaInterface lambdaInterface = () -> System.out.println("test");

    public static void func(lambdaInterface lambdaInterface) {
        lambdaInterface.test();
    }

    public static void main(String[] args) {
        func(() -> System.out.println("check"));
        List userlist = new ArrayList();
        userlist.add("121");
        userlist.add("121");
        userlist.add("121");
        userlist.add("121");
        userlist.add("121");
        long cout=userlist.stream().filter(((i)->("121").equals(i))).count();
        //long count = userlist.stream().filter((student -> student.equals("121"))).count();
        System.out.println(cout);
    }
}
