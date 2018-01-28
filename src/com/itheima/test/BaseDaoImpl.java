package com.itheima.test;

public class BaseDaoImpl<T> {
    public  void save(T t){
        String s=(String)t;
        String s1 = s.substring(0, 2);
        byte[] bytes = "吴建华hello".getBytes();
        char[] chars = "吴建华hello".toCharArray();
        for (byte by:bytes){
            System.out.println(by);
        }
    }
}
