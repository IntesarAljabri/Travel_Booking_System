package Travel_Bookin_System.Controllers;

import Travel_Bookin_System.Models.Booking;
import Travel_Bookin_System.Services.BookingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Booking")
public class BookingControllers {
    @Autowired
    BookingServices bookingService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Booking> List<Booking> getAllBookings() {

        return (List<Booking>) bookingService.getAllBookings();
    }
}
