package com.tzc.demo05;

/**
 * @author xuhao
 * @create 2022-03-01 20:39
 */
public class ThreadDemo05 {
    public static void main(String[] args) {
        //创建卖票的执行动作对象
        Ticket t = new Ticket();

        //创建3个卖票窗口
        Thread t1 = new Thread(t, "窗口1");
        Thread t2 = new Thread(t, "窗口2");
        Thread t3 = new Thread(t, "窗口3");

        //开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
