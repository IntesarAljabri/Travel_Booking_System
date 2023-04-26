package Travel_Bookin_System.Repositories;

import Travel_Bookin_System.Models.Customer;
import Travel_Bookin_System.Models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepositpries extends JpaRepository<Flight, Integer> {
}
