import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.alpha.Hospital.Entity.Patient;
import com.alpha.Hospital.Service.PatientService;

import jakarta.validation.Valid;

@RestControllerAdvice
	public class PatientController {

	    @Autowired
	    private PatientService ps;

	    @PostMapping("/save")
	    public void savePatient(@RequestBody @Valid Patient p) {
	        ps.savePatient(p);
	    }

	    @GetMapping("/find")
	    public ResponseStructure<Patient> findPatient(@RequestParam int id) {
	        return ps.findPatient(id);
	    }

	    @DeleteMapping("/delete")
	    public void deletePatient(@RequestParam int id) {
	        ps.deletePatient(id);
	    }

	    @PutMapping("/update")
	    public void updatePatient(@RequestParam int id, @RequestBody Patient p) {
	        ps.updatePatient(id, p);
	    }
	}

