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
@Table(name = "Booking")


public class Booking {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;

        @Column(name = "hotel_name")
        String name;

        @Column(name = "noOfRoom")
        String room;

        @OneToMany(mappedBy = "Booking")
        @JsonIgnore
        List<Customer> customer;

        @OneToMany(mappedBy = "Booking")
        @JsonIgnore
        List<Hotel> hotel;
}
