package Travel_Bookin_System.Services;

import Travel_Bookin_System.Repositories.CarRentalRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarRentalServices<Car> {

    @Autowired
    CarRentalRepositories carRepositories;

    public <Car> List<Car> getAllCarRental() {
        return carRepositories.findAll();
    }
    public Car getCarRentalById (Integer id){
        return (Car) carRepositories.findById(id).get();
    }

}
