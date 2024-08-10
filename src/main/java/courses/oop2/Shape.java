package courses.oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Shape {
    @Getter @Setter
    private String color;
    @Getter @Setter
    private int vertices;

}
