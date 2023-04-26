package Travel_Bookin_System.Services;

import Travel_Bookin_System.Repositories.RatingRepositpries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServices<Ratings> {
    @Autowired
    RatingRepositpries ratingRepositories;
    public List<Ratings> getAllRatings() {
        return ratingRepositories.findAll();
    }
    public Ratings getRatingsById(Integer id) {

        return (Ratings) ratingRepositories.findById(id).get();
    }
}
