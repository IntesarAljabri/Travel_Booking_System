package Travel_Bookin_System.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepositories<Ratings> extends JpaRepository<Ratings, Integer> {
}
