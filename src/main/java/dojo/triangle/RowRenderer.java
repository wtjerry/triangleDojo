package dojo.triangle;

import java.util.List;
import java.util.stream.Collectors;

public class RowRenderer {

    public String render(List<Row> rows) {
        return rows.stream()
                .map(this::convert)
                .collect(Collectors.joining("\n"));
    }

    private String convert(Row row) {
        char[] charRow = " ".repeat(row.getColumn2() + 1).toCharArray();
        charRow[row.getColumn1()] = 'x';
        charRow[row.getColumn2()] = 'x';

        return String.valueOf(charRow);
    }
}
