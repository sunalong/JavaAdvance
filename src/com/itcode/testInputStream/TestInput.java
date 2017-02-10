package com.itcode.testInputStream;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 测试解析主机名
 * Created by along on 17/1/14 13:35.
 */
public class TestInput {

    public static void main(String[] args) throws Exception {
        System.out.println("--1--当前时间："+System.currentTimeMillis());
        try {
            InetAddress address = InetAddress.getByName("www.example.com");
            System.out.println("-2----当前时间："+System.currentTimeMillis());
            System.out.println(address.getHostAddress());
            System.out.println("-2-1---当前时间："+System.currentTimeMillis());
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("-2-2---当前时间："+System.currentTimeMillis());
        }
        System.out.println("-3----当前时间："+System.currentTimeMillis());
    }

}
