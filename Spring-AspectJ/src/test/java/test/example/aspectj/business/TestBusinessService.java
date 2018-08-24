package test.example.aspectj.business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.aspectj.business.ApplicationContextConfiguration;
import com.example.aspectj.business.BusinessServices;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationContextConfiguration.class)
public class TestBusinessService {
	
	@Autowired
	private BusinessServices service;
	
	@Test
	public void testAllMethods() {
		service.printAge(25);
		service.printName("Elison Nayak");
		service.getDetails();
	}
}

