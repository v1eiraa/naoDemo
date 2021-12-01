package com.example.naodemo.model;

import com.sun.marlin.DTransformingPathConsumer2D;

import java.util.Random;

public class Dado {
    //att
    private int face;

    public Dado(){
        this.face = 0;
    }

    public void lancar(){
        Random r= new Random();
       // this.face= r.nextInt(6)+1;
        while (face == 0) face = r.nextInt(7);
    }

    public int getFace() {return face;}

}
