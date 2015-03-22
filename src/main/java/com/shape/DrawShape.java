package com.shape;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.Optional;

/**
 * Created by neerajsi on 22/03/15.
 */
public class DrawShape {

    Shape s1;

    Shape s2;


    @Inject
    public DrawShape(Shape s1, Shape2Holder holder) {
        this.s1 = s1;
        this.s2 = holder.s2;
    }

    public void draw(){
        System.out.println(s1.getType());
        System.out.println(s2.getType());
    }

    static class Shape2Holder{
        @Inject(optional=true) Shape s2 = new Triangle();
    }
}
