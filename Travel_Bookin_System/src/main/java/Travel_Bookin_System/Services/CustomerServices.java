package Travel_Bookin_System.Services;

import Travel_Bookin_System.Models.Customer;
import Travel_Bookin_System.Repositories.CustomerRepositpries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {
    @Autowired
    CustomerRepositpries customerRepositories;
    public List<Customer> getAllCustomer() {

        return customerRepositories.findAll();
    }

    public Customer getCustomer(Integer id) {

        return customerRepositories.findById(id).get();
    }

}
