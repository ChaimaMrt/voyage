package tn.esprit.pidev;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.pidev.entities.Employe;
import tn.esprit.pidev.repositories.EmployeRepository;

@SpringBootTest

class VoyageApplicationTests {
	@Autowired
	private EmployeRepository employeRepository;
	
	//@Test 
	//public void testAjouterEmploye() {Employe emp = new Employe(0, "123", "123", "123", "123", null, null, null, null, null);
	//employeRepository.save(emp);

//}
}
