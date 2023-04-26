package Travel_Bookin_System.Repositories;

import Travel_Bookin_System.Models.Booking;
import Travel_Bookin_System.Models.Cancellation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancellationRepositpries extends JpaRepository<Cancellation, Integer> {
}
