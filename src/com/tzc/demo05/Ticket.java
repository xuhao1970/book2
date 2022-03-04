package com.tzc.demo05;

/**
 * @author xuhao
 * @create 2022-03-01 20:39
 */
public class Ticket implements Runnable {
    //设置票总张数
    private int ticket = 100;


    @Override
    public void run()  {
        //针对票剩余张数循环判断
        while (ticket > 0) {
            synchronized (this) {
                if (ticket > 0) {
                    //线程执行动作会有多行代码,用sleep()让线程对象休息一会,代表执行这些逻辑代码所消耗的时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //获取线程的名字
                    String name = Thread.currentThread().getName();
                    //进行卖票
                    System.out.println(name + "正在卖第" + ticket-- + "张");
                }
            }
        }
    }
}
