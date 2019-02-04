package dojo.triangle;

import java.util.ArrayList;
import java.util.Collections;

public class TriangleApp {

    public static void main(String[] args) {
        var rows = new TriangleGenerator().generate(10).getRows();

        var triangleRenderer = new RowRenderer();
        var reversedRows = new ArrayList<>(rows);
        Collections.reverse(reversedRows);

        System.out.println(triangleRenderer.render(rows));
        System.out.println(triangleRenderer.render(reversedRows));
        System.out.println(triangleRenderer.render(rows));
        System.out.println(triangleRenderer.render(reversedRows));
    }
}
