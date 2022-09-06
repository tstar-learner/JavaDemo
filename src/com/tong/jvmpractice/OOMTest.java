package com.tong.jvmpractice;

import java.util.ArrayList;
import java.util.Random;

public class OOMTest {
    public static void main(String[] args) {
        ArrayList<Picture> list=new ArrayList<>();
        int[] i={1,2,3};
        while (true){
            try {
                Thread.sleep(20);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            list.add(new Picture(i));
        }
    }
}

class Picture{
    //byte[] pixels;
    int[] i;

    public Picture(int[] i){
        //this.pixels=new byte[length];
        this.i=i;
    }
}
