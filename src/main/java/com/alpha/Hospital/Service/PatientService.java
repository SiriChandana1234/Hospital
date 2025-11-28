import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.alpha.Hospital.Entity.Patient;
import com.alpha.Hospital.Repository.PatientRepositorylayer;

@Service
public class PatientService {

    @Autowired
    private PatientRepositorylayer pr;

    public void savePatient(Patient p) {
        pr.save(p);
    }

    public ResponseStructure<Patient> findPatient(int id) {
        Patient p = pr.findById(id).orElseThrow(() -> new PatientNotFoundException());

        ResponseStructure<Patient> rs = new ResponseStructure<>();
        rs.setStatuscode(HttpStatus.FOUND.value());
        rs.setMessage("Patient found with id: " + id);
        rs.setData(p);

        return rs;
    }

    public void deletePatient(int id) {
        pr.deleteById(id);
    }

    public void updatePatient(int id, Patient updated) {
        Patient p = pr.findById(id).orElseThrow(() -> new PatientNotFoundException());

        p.setName(updated.getName());
        p.setDisease(updated.getDisease());
        pr.save(p);
    }
}