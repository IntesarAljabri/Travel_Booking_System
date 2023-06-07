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
@Table(name = "Flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "flightName")
    String name;
    @Column(name = "noOfSeat")
    Integer Seat;
    @Column(name = "Date")
    String date;
    @Column(name = "time")
    String time;

    @OneToMany(mappedBy = "Flight")
    @JsonIgnore
    List<Customer> customer;

}
