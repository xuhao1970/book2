package com.tzc.demo02;

/**
 * @author xuhao
 * @create 2022-03-01 20:32
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        //3.在测试类中使用多态方式创建Runnable接口的实现类对象
        Runnable run = new SubRunnable();

        //4.在测试类中需要多少条线程,就创建多少个Thread类的对象,并将Runnable接口的实现类对象作为参数
        Thread t1 = new Thread(run, "自定义线程1");
        Thread t2 = new Thread(run, "自定义线程2");

        //5.开启线程
        t1.start();
        t2.start();
    }
}
