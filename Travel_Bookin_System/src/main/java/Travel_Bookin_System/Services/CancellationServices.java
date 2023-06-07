package Travel_Bookin_System.Services;

import Travel_Bookin_System.Models.Cancellation;
import Travel_Bookin_System.Repositories.CancellationRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CancellationServices {
    @Autowired
    CancellationRepositories cancellationRepositories;

    public List<Cancellation> getAllCancellation() {
        return cancellationRepositories.findAll();
    }
    public Cancellation getCancellationById (Integer id){
        return cancellationRepositories.findById(id).get();
    }

}
