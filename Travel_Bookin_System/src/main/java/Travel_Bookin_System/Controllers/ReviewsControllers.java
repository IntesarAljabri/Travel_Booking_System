package Travel_Bookin_System.Controllers;

import Travel_Bookin_System.Models.Reviews;
import Travel_Bookin_System.Services.ReviewsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("Reviews")
public class ReviewsControllers {

    @Autowired
    ReviewsServices reviewService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Reviews> getAllRatings() {

        return (List<Reviews>) reviewService. getAllReviews();
    }

}
