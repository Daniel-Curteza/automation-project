package courses.oop2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

public class Square extends Rectangle{
    @Getter @Setter
    private int length;

    public Square(int length) {
        super(length, length);
    }
}
