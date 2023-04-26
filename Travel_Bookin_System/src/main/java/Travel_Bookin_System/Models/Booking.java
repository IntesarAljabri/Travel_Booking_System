package Travel_Bookin_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Data
@Entity
@Table(name = "Booking")


public class Booking {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;

        @Column(name = "hotel_name")
        String name;

        @Column(name = "noOfRoom")
        String room;
}
