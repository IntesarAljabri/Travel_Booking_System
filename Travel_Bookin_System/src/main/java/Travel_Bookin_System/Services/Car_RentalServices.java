package Travel_Bookin_System.Services;

import Travel_Bookin_System.Models.Booking;
import Travel_Bookin_System.Repositories.BookingRepositories;
import Travel_Bookin_System.Repositories.CancellationRepositpries;
import Travel_Bookin_System.Repositories.Car_RentalRepositpries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Car_RentalServices<Car> {

    @Autowired
    Car_RentalRepositpries carRepositories;

    public <Car> List<Car> getAllCarRental() {
        return carRepositories.findAll();
    }
    public Car getCarRentalById (Integer id){
        return (Car) carRepositories.findById(id).get();
    }

}
