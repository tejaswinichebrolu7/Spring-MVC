package com.in28minutes.login;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LoginServiceTest {
	
	
	@InjectMocks
	private LoginService loginService;
	
	@BeforeClass
	public void beforeTests() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testValidateUserWithValidDetails() {
		String user = "teja";
		String password = "dummy";
		boolean output = loginService.validateUser(user, password);	
		assertEquals(output,true);
	}
	
	@Test
	public void testValidateUserWithInValidUser() {
		String user = "test";
		String password = "dummy";
		boolean output = loginService.validateUser(user, password);	
		assertEquals(output,false);
	}
	
	@Test
	public void testValidateUserWithInValidPassword() {
		String user = "teja";
		String password = "wrong";
		boolean output = loginService.validateUser(user, password);	
		assertEquals(output,false);
	}
	
	@Test
	public void testValidateUserWithInValidUserAndPassword() {
		String user = "test";
		String password = "wrong";
		boolean output = loginService.validateUser(user, password);	
		assertEquals(output,false);
	}
}