package Travel_Bookin_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "hotel_name")
    String name;

    @Column(name = "price")
    Integer price;

    @Column(name = "Date")
    String date;

    @Column(name = "Room_type")
    String roomType;

    @Column(name = "noOfRoom")
    Integer noOfRoom;

}
