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
@Table(name = "Car_Rental")
public class Car_Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "car_name")
    String name;

    @Column(name = "TypeOfCar")
    String Type;
    @Column(name = "car_price")
    String price;

    @OneToOne(mappedBy = "Car_Rental")
    @JsonIgnore
    List<Customer> customer;
}
