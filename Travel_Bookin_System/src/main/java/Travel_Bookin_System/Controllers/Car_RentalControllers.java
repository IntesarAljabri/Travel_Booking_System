package Travel_Bookin_System.Controllers;

import Travel_Bookin_System.Services.BookingServices;
import Travel_Bookin_System.Services.Car_RentalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Car_Rental")

public class Car_RentalControllers {
    @Autowired
    Car_RentalServices  carService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Car> List<Car> getAllCar_Rental() {

        return (List<Car>) carService.getAllCarRental();
    }
}
