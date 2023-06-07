package Travel_Bookin_System.Repositories;

import Travel_Bookin_System.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepositories extends JpaRepository <Booking, Integer> {
}
