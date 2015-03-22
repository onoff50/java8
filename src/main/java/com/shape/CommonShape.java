package com.shape;

/**
 * Created by neerajsi on 22/03/15.
 */
public class CommonShape implements Shape{

    @Override
    public String getType() {
        return this.getClass().getName();
    }
}
