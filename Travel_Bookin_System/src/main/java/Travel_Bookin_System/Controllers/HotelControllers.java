package Travel_Bookin_System.Controllers;

import Travel_Bookin_System.Models.Flight;
import Travel_Bookin_System.Models.Hotel;
import Travel_Bookin_System.Services.FlightServices;
import Travel_Bookin_System.Services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Hotel")
public class HotelControllers {


    @Autowired
    HotelServices hotelService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Hotel> getAllHotel() {

        return hotelService.getAllHotel();
    }
    @GetMapping(value = "getById")
    public Hotel getHotelById(@RequestParam Integer id) {
        return (Hotel) hotelService.getAllHotel();
    }
}
