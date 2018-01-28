package com.itheima.test;

import com.itheima.dao.BaseDao;

public class BaseTest {
    public static void main(String[] args) {
        BaseDaoImpl<String> dao = new BaseDaoImpl<>();
        dao.save("hello");
    }
}
