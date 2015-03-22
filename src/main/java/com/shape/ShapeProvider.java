package com.shape;

import com.google.inject.Provider;

/**
 * Created by neerajsi on 22/03/15.
 */
public class ShapeProvider implements Provider<Shape> {

    @Override
    public Shape get() {
        return new Triangle();
    }
}
