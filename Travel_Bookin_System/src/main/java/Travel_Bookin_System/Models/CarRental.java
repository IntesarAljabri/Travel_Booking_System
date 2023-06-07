package Travel_Bookin_System.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "CarRental")
public class CarRental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "carName")
    String name;

    @Column(name = "TypeOfCar")
    String Type;
    @Column(name = "carPrice")
    String price;

    @OneToOne(mappedBy = "CarRental")
    @JsonIgnore
    List<Customer> customer;
}
