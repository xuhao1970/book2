package com.tzc.socket.demo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author xuhao
 * @create 2022-03-01 20:57
 */
public class SocketDemo01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip1 = InetAddress.getLocalHost();

        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());
        System.out.println("=====================");

        //获取指定主机的IP对象
        InetAddress ip2 = InetAddress.getByName("DESKTOP-A0VD0S2");
        //获取IP对象的字符串形式的主机名和IP
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        System.out.println("===========================================");

        //获取指定主机的IP对象
        InetAddress ip3 = InetAddress.getByName("www.jd.com");
        //获取IP对象的字符串形式的主机名和IP
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());


    }
}
