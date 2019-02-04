package dojo.triangle;

public class Row {
    private final Integer column1;
    private final Integer column2;

    public Row(Integer column1, Integer column2) {
        this.column1 = column1;
        this.column2 = column2;
    }

    public Integer getColumn1() {
        return column1;
    }

    public Integer getColumn2() {
        return column2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Row row = (Row) o;

        if (!column1.equals(row.column1)) return false;
        return column2.equals(row.column2);
    }

    @Override
    public int hashCode() {
        int result = column1.hashCode();
        result = 31 * result + column2.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Row{" +
                "column1=" + column1 +
                ", column2=" + column2 +
                '}';
    }
}
