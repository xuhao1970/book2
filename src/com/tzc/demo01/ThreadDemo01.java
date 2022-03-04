package com.tzc.demo01;

/**
 * @author xuhao
 * @create 2022-03-01 20:30
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        //4.在测试类中,需要多少条线程就创建多少个Thread类的子类对象
        SubThread s1 = new SubThread("自定义线程11");
        SubThread s2 = new SubThread("自定义线程22");
        SubThread s3 = new SubThread("自定义线程33");

        //5.开启线程
        s2.start();
        s1.start();
    }
}
