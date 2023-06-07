package Travel_Bookin_System.Controllers;

import Travel_Bookin_System.Models.Customer;
import Travel_Bookin_System.Models.Flight;
import Travel_Bookin_System.Services.CustomerServices;
import Travel_Bookin_System.Services.FlightServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Flight")
public class FlightControllers {

    @Autowired
    FlightServices flightService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Flight> getAllFlight() {

        return flightService.getAllFlight();
    }
    @GetMapping(value = "getById")
    public Flight getFlightById(@RequestParam Integer id) {
        return (Flight) flightService.getAllFlight();
    }
}

