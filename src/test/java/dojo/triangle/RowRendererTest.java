package dojo.triangle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class RowRendererTest {
    @Test
    void render_empty_nothing() {
        var renderedTriangle =
                new RowRenderer().render(Collections.emptyList());
        assertThat(renderedTriangle, is(""));
    }

    @Test
    void render_1row() {
        var row = new Row(0, 0);
        var renderedTriangle =
                new RowRenderer().render(Collections.singletonList(row));
        var expectedTriangle = "x";

        assertThat(renderedTriangle, is(expectedTriangle));
    }

    @Test
    void render_2row() {
        var rows = Arrays.asList(new Row(1, 1), new Row(0, 2));

        var renderedTriangle =
                new RowRenderer().render(rows);
        var expectedTriangle = " x\nx x";

        assertThat(renderedTriangle, is(expectedTriangle));
    }

    @Test
    void render_3row() {
        var rows = Arrays.asList(
                new Row(0, 5),
                new Row(1, 1),
                new Row(3, 7));

        var renderedTriangle =
                new RowRenderer().render(rows);
        var expectedTriangle = "x    x\n"
                             + " x\n"
                             + "   x   x";

        assertThat(renderedTriangle, is(expectedTriangle));
    }
}