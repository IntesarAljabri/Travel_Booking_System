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
@Table(name = "Hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "hotelName")
    String name;

    @Column(name = "price")
    Integer price;

    @Column(name = "Date")
    String date;

    @Column(name = "RoomType")
    String roomType;

    @Column(name = "noOfRoom")
    Integer noOfRoom;

    @OneToMany(mappedBy = "Hotel")
    @JsonIgnore
    List<Customer> customer;

    @OneToMany(mappedBy = "Hotel")
    @JsonIgnore
    List<Booking> booking;

    @OneToMany(mappedBy = "Hotel")
    @JsonIgnore
    List<CarRental> car;

}
