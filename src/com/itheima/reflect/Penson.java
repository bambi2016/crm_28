package com.itheima.reflect;

public class Penson {
    private int count;

    public Penson(int count) {
        this.count = count;
    }
    public Penson() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int fun1(int m){
        System.out.println("有返回值---空参方法");
        return this.count*m;
    }
}
