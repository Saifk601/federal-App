package in.saifit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SsnVerify {
	
	@GetMapping("/ssn/{ssn}")
	public ResponseEntity<String> getStateName(@PathVariable Long ssn){
		String stateName = "";
		if(ssn >= 500000 && ssn <= 599999) {
			stateName = "New Jersey";
		}else if(ssn >= 400000 && ssn <= 499999) {
			stateName = "Ohio";
		}else if(ssn >= 300000 && ssn <= 399999) {
			stateName = "California";
		}else {
			stateName = "No State here";
		}
		
		return new ResponseEntity<>(stateName , HttpStatus.OK);
		
	}

}
