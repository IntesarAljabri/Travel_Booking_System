package Travel_Bookin_System.Controllers;

import Travel_Bookin_System.Models.Customer;
import Travel_Bookin_System.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("customer")
public class CustomerControllers {

    @Autowired
    CustomerServices customerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {

        return customerService.getAllCustomer();
    }
    @GetMapping(value = "getById")
    public Customer getCustomerById(@RequestParam Integer id) {
        return customerService.getCustomer(id);
    }
}
