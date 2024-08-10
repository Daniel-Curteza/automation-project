package homework.exercises.library;

import lombok.Getter;
import lombok.Setter;

public class Author {
    @Getter @Setter
    public String name;

    @Getter @Setter
    public String email;

    public Author(String name, String email){
        this.name = name;
        this.email = email;
    }
}
