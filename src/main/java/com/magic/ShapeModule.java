package com.magic;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.shape.*;

/**
 * Created by neerajsi on 22/03/15.
 */
public class ShapeModule extends AbstractModule {
    @Override
    protected void configure() {

//        bind(Shape.class).annotatedWith(Names.named("Circle")).to(Circle.class);
//        bind(Shape.class).annotatedWith(Names.named("Triangle")).to(Triangle.class);
        bind(DrawShape.class);

        bind(Shape.class).toProvider(ShapeProvider.class);

    }
}
