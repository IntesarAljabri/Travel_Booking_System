package Travel_Bookin_System.Repositories;

import Travel_Bookin_System.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositpries extends JpaRepository<Customer, Integer> {
}
