package com.tong.jvmpractice;

public class ClassLoaderTest extends ClassLoader{
    public static void main(String[] args) {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        System.out.println(cl);
        ClassLoader cl1=ClassLoaderTest.class.getClassLoader();
        System.out.println(cl1);
        try {
            ClassLoader cl2=Class.forName("java.lang.String").getClassLoader();
            System.out.println(cl2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
