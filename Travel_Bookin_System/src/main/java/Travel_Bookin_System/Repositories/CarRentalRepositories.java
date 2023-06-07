package Travel_Bookin_System.Repositories;

import Travel_Bookin_System.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentalRepositories<Car> extends JpaRepository<Car, Integer> {
}
