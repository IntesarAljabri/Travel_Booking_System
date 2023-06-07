package Travel_Bookin_System.Services;

import Travel_Bookin_System.Models.Booking;
import Travel_Bookin_System.Models.Hotel;
import Travel_Bookin_System.Repositories.BookingRepositories;
import Travel_Bookin_System.Repositories.HotelRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServices {

    @Autowired
    HotelRepositories hotelRepositories;

    public List<Hotel> getAllHotel() {
        return hotelRepositories.findAll();
    }
    public Hotel getHotelById (Integer id){
        return hotelRepositories.findById(id).get();
    }

}
