package Travel_Bookin_System.Controllers;

import Travel_Bookin_System.Services.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Ranting")
public class RantingControllers {
    @Autowired
    RatingServices ratingService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Ratings> List<Ratings> getAllRatings() {

        return (List<Ratings>) ratingService.getAllRatings();
    }
}
