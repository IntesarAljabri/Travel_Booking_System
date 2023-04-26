package Travel_Bookin_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "flight_name")
    String name;
    @Column(name = "noOfSeat")
    Integer Seat;
    @Column(name = "Date")
    String date;
    @Column(name = "time")
    String time;
}
