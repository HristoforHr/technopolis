package technopolisspring.technopolis.model.pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    private long id;
    private String title;
    private String comment;
    private long userId;
    private long productId;

}
