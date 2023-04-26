package Travel_Bookin_System.Repositories;

import Travel_Bookin_System.Models.Customer;
import Travel_Bookin_System.Models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepositpries extends JpaRepository<Hotel, Integer> {
}
