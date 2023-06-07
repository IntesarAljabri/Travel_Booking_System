package Travel_Bookin_System.Services;

import Travel_Bookin_System.Models.Reviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Service
public class ReviewsServices {
    @Autowired
    ReviewsServices reviewService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Reviews> getAllReviews() {

        return (List<Reviews>) reviewService. getAllReviews();
    }

}
