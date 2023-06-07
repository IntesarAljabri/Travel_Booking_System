package Travel_Bookin_System.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepositories<Payments> extends JpaRepository<Payments, Integer> {
}
