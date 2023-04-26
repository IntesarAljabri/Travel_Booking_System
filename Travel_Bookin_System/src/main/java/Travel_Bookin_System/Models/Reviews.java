package Travel_Bookin_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "reviews")
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column(name = "reviewer_name")
    String name;

    @Column(name = "review_date")
    String date;

    @Column(name = "review_type")
    String type;
}
