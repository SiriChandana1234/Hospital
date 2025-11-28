

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.alpha.Hospital.Entity.Doctor;
import com.alpha.Hospital.Repository.DoctorRepository;


@Service
public class DoctorService {

    @Autowired
    private DoctorRepository dr;

    public void saveDoctor(Doctor d) {
        dr.save(d);
    }

    public ResponseStructure<Doctor> findDoctor(int id) {
        Doctor d = dr.findById(id).orElseThrow(() -> new DoctorNotFoundException());

        ResponseStructure<Doctor> rs = new ResponseStructure<>();
        rs.setStatuscode(HttpStatus.FOUND.value());
        rs.setMessage("Doctor found with id: " + id);
        rs.setData(d);

        return rs;
    }

    public void deleteDoctor(int id) {
        dr.deleteById(id);
    }

    public void updateDoctor(int id, Doctor updated) {
        Doctor d = dr.findById(id).orElseThrow(() -> new DoctorNotFoundException());

        d.setName(updated.getName());
        d.setSpecialization(updated.getSpecialization());
        d.setPatients(updated.getPatients());
        dr.save(d);
    }
}