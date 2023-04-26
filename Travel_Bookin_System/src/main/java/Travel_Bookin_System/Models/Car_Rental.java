package Travel_Bookin_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
}
