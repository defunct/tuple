package com.mallardsoft.tuple.mix;

import com.goodworkalan.mix.ProjectModule;
import com.goodworkalan.mix.builder.Builder;
import com.goodworkalan.mix.builder.JavaProject;

/**
 * Builds the project definition for Tuple.
 *
 * @author Alan Gutierrez
 */
public class TupleProject implements ProjectModule {
    /**
     * Build the project definition for Tuple.
     *
     * @param builder
     *          The project builder.
     */
    public void build(Builder builder) {
        builder
            .cookbook(JavaProject.class)
                .produces("com.mallardsoft/tuple/2.0")
                .depends()
                    .development("junit/junit/4.4")
                    .end()
                .end()
            .end();
    }
}
