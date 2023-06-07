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
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column(name = "customerName")
    String name;

    @Column(name = "customerAddress")
    String address;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    List<Hotel> hotel;
}
