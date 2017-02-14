package com.itcode.check;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by along on 17/2/13 17:11.
 */
public class ChangeData {
    static String mobileJava = "/Users/along/Desktop/mobile.java";
    public static void main(String[] args) {
        List<DeviceDomain> mobileJavaList = changeFormat(mobileJava);
        printList(mobileJavaList);
    }
    private static void printList(List<DeviceDomain> weHaveList) {
        for (int i = 0; i < weHaveList.size(); i++) {
            System.out.println(weHaveList.get(i));
        }
    }
    public static List<DeviceDomain> changeFormat(String file) {
        List<DeviceDomain> contextList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String name = null;
            int number = 0;
            while ((name = br.readLine()) != null) {//使用readLine方法，一次读一行
                if (name.trim().contains("]") || name.trim().contains("[")||name.trim().contains("{")||name.trim().contains("}"))
                    System.out.println("要删除的行：" + name.trim());
                else {
                    DeviceDomain deviceDomain = new DeviceDomain(false, name.trim(), ++number);
                    contextList.add(deviceDomain);
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contextList;
    }
}
