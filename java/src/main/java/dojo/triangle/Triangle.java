package dojo.triangle;

import java.util.List;
import java.util.Objects;

public class Triangle {
    private final List<Row> rows;

    public Triangle(List<Row> rows) {
        this.rows = rows;
    }

    public List<Row> getRows() {
        return rows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        return Objects.equals(rows, triangle.rows);
    }

    @Override
    public int hashCode() {
        return rows != null ? rows.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "rows=" + rows +
                '}';
    }
}
