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
@Table(name = "Payment_Method")
public class Payment_Method {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "PaymentType")
    String PaymentType;

    @OneToOne(mappedBy = "PaymentMethod")
    @JsonIgnore
    List<Customer> customer;
}
