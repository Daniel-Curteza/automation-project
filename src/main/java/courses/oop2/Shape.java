package courses.oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Shape implements IShape {
    @Getter @Setter
    private String color;
    @Getter @Setter
    private int vertices;

    @Override
    public void draw() {

    }

    @Override
    public void printShape() {

    }

    @Override
    public int countVertices() {
        return 0;
    }
}
