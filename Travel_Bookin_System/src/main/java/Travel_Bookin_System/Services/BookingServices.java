package Travel_Bookin_System.Services;

import Travel_Bookin_System.Models.Booking;
import Travel_Bookin_System.Repositories.BookingRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingServices {

    @Autowired
    BookingRepositories  bookingRepositories;

    public List<Booking> getAllBookings() {
        return bookingRepositories.findAll();
    }
    public Booking getItemById (Integer id){
        return bookingRepositories.findById(id).get();
    }

}
