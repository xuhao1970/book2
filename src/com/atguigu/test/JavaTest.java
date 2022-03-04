package com.atguigu.test;

import java.io.File;

/**
 * @author xuhao
 * @create 2022-02-28 20:55
 */
public class JavaTest {
    public static void main(String[] args) {
        File f1 = new File("D:\\a");//真实存在的文件夹
        File f2 = new File("G:\\abc\\a.txt");//真实存在的文件
        File f3 = new File("G:\\abc\\b");//不存在的文件夹
        File f4 = new File("abc.txt");
        File f5 = new File("");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        System.out.println("===============================");

        //打印f2的绝对路径和相对路径
        System.out.println(f2.getAbsolutePath());//绝对路径
        System.out.println(f2.getPath());//相对路径

        System.out.println("=============");

        //打印f4的绝对路径和相对路径
        System.out.println(f4.getAbsolutePath());//绝对路径
        System.out.println(f4.getPath());//相对路径
        System.out.println("===============================");

        //获取File对象的名字
        System.out.println(f1.getName());
        System.out.println("===============================");

        //获取File对象的长度(大小)
        System.out.println(f2.length());
        System.out.println("===============================");

        //判断File对象所表示的路径是否真实存在
        System.out.println(f1.exists());
        System.out.println(f3.exists());
        System.out.println("===============================");

        //判断File对象所表示的路径是否为文件
        System.out.println(f2.isFile());
        System.out.println(f3.isFile());
        System.out.println("===============================");
    }
}
