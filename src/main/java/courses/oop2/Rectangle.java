package courses.oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor

public class Rectangle extends Shape{

    @Getter @Setter
    private int width;

    @Getter @Setter
    private int height;

}
