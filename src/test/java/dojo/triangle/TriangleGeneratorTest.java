package dojo.triangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;

class TriangleGeneratorTest {

    @Test
    void generate() {
        var triangle = new TriangleGenerator();
        assertThat(triangle.generate(), not(toString().isEmpty()));
    }
}