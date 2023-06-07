package Travel_Bookin_System.Controllers;

import Travel_Bookin_System.Services.BookingServices;
import Travel_Bookin_System.Services.CancellationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Cancellation")
public class CancellationControllers {

    @Autowired
    CancellationServices cancellationService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Cancellation> List<Cancellation> getAllCancellation() {

        return (List<Cancellation>) cancellationService.getAllCancellation();
    }
}
