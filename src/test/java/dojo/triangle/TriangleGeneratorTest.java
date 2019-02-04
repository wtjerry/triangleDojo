package dojo.triangle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class TriangleGeneratorTest {
    @Test
    void generate_height0_rows0() {
        var generator = new TriangleGenerator();
        var triangle = generator.generate(0);
        assertThat(triangle.getRows().size(), is(0));
    }

    @Test
    void generate_height1_rows1() {
        var generator = new TriangleGenerator();
        var row = new Row(0, 0);
        var expectedTriangle = new Triangle(Collections.singletonList(row));

        var triangle = generator.generate(1);

        assertThat(triangle.getRows().size(), is(1));
        assertThat(triangle, is(expectedTriangle));
    }

    @Test
    void generate_height2_rows2() {
        var generator = new TriangleGenerator();
        var row1 = new Row(1, 1);
        var row2 = new Row(0, 2);
        var expectedTriangle = new Triangle(Arrays.asList(row1, row2));

        var triangle = generator.generate(2);
        assertThat(triangle.getRows().size(), is(2));
        assertThat(triangle, is(expectedTriangle));
    }

    @Test
    void generate_height6() {
        var generator = new TriangleGenerator();
        var row1 = new Row(5, 5);
        var row2 = new Row(4, 6);
        var row3 = new Row(3, 7);
        var row4 = new Row(2, 8);
        var row5 = new Row(1, 9);
        var row6 = new Row(0, 10);
        var expectedTriangle =
                new Triangle(Arrays.asList(row1, row2, row3, row4, row5, row6));

        var triangle = generator.generate(6);
        assertThat(triangle.getRows().size(), is(6));
        assertThat(triangle, is(expectedTriangle));
    }
}