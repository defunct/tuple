package com.mallardsoft.tuple.mix;

import com.goodworkalan.mix.ProjectModule;
import com.goodworkalan.mix.builder.Builder;
import com.goodworkalan.mix.builder.JavaProject;

public class TupleProject extends ProjectModule {
    @Override
    public void build(Builder builder) {
        builder
            .cookbook(JavaProject.class)
                .produces("com.mallardsoft/tuple/2.0")
                .test()
                    .depends()
                        .include("junit/junit/4.4")
                        .end()
                    .end()
                .end()
            .end();
    }
}
