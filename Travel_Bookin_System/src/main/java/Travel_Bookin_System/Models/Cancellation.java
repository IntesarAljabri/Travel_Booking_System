package Travel_Bookin_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Cancellation")
public class Cancellation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;



}
