package com.tzc.demo01;

/**
 * @author xuhao
 * @create 2022-03-01 20:30
 */
public class SubThread extends Thread {
    public SubThread(String name) {
        super(name);
    }

    @Override
    public void run () {
        for (int i = 1; i <= 30; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
