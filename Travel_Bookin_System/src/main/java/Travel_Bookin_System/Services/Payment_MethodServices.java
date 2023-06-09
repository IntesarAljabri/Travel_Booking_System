package Travel_Bookin_System.Services;

import Travel_Bookin_System.Repositories.Payment_MethodRepositpries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Payment_MethodServices<Payments> {
    @Autowired
    Payment_MethodRepositpries paymentRepositories;
    public List<Payments> getAllPayments() {
        return (List<Payments>) paymentRepositories.findAll();
    }
    public Payments getPaymenttById(Integer id) {

        return (Payments) paymentRepositories.findById(id).get();
    }
}
