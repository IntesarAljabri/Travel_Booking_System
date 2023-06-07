package Travel_Bookin_System.Services;

import Travel_Bookin_System.Models.Booking;
import Travel_Bookin_System.Models.Flight;
import Travel_Bookin_System.Repositories.BookingRepositories;
import Travel_Bookin_System.Repositories.FlightRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlightServices {

    @Autowired
    FlightRepositories flightRepositories;

    public List<Flight> getAllFlight() {
        return flightRepositories.findAll();
    }
    public Flight getFlightById (Integer id){
        return flightRepositories.findById(id).get();
    }

}
