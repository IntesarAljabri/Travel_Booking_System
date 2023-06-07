package Travel_Bookin_System.Controllers;

import Travel_Bookin_System.Services.Payment_MethodServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("Payment")
public class PaymentMethodControllers<Payments> {
    @Autowired
    Payment_MethodServices paymentServices;

    @GetMapping("all")
    public List<Payments> getAllMarkets() {
        return paymentServices.getAllPayments();
    }
}
