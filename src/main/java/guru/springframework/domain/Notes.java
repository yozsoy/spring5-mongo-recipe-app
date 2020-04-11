package guru.springframework.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

@Setter
public class Notes {

    @Id
    private String id;
    private String recipeNotes;
}
