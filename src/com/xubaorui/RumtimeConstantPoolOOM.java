package com.xubaorui;

/**
 * @author xbr
 * @Date 2020-03-20
 * @ClassName RumtimeConstantPoolOOM
 * @Description
 */
public class RumtimeConstantPoolOOM {

    public static void main(String[] args) {

        String str1 = new StringBuilder("计算机").append("软件").toString();
        String internStr1 = str1.intern();
        System.out.println(internStr1 == str1);
        System.out.println("str1:"+str1.hashCode());
        System.out.println("internStr1:"+internStr1.hashCode());

        String str2 = new StringBuilder("ja").append("va").toString();
        String internStr2 = str2.intern();
        System.out.println(internStr2 == str2);
        System.out.println("str2:"+str2.hashCode());
        System.out.println("internStr2:"+internStr2.hashCode());

        String c = new String("1");
        String d = new String("1");
        System.out.println(c == d);
    }
}
