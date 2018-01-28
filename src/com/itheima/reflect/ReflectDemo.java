package com.itheima.reflect;

import java.lang.reflect.*;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        new ReflectDemo().fun();
    }
    public void fun(){
        Type type = this.getClass().getGenericSuperclass();
        if (type instanceof ParameterizedType){
            ParameterizedType type1=(ParameterizedType)type;
            System.out.println(type1);
        }
    }
}
