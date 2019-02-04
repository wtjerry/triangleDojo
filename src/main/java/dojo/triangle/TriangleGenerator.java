package dojo.triangle;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TriangleGenerator {
    public Triangle generate(final int height) {
        List<Row> rows = IntStream.range(0, height)
                .mapToObj(i -> this.generateRow(i, height))
                .collect(Collectors.toUnmodifiableList());

        return new Triangle(rows);
    }

    private Row generateRow(final int currentRowIndex, final int totalRows) {
        int middleColumn = totalRows - 1;
        var firstChar = middleColumn - currentRowIndex;
        var secondChar = middleColumn + currentRowIndex;

        return new Row(firstChar, secondChar);
    }
}