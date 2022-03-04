package com.tzc.demo02;

/**
 * @author xuhao
 * @create 2022-03-01 20:32
 */
public class SubRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            //获取当前执行线程的引用
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + ":" + i);
        }
    }
}

