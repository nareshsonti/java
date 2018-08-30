package com.employee.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnit44Runner;
@RunWith(MockitoJUnit44Runner.class)
public class EmployeeServiceTest {
	EmployeeService employeeService = null;
	@Mock
	CalculatorService CalculatorService ;

	@Before
	public void beforSetup() {
		employeeService = new EmployeeService(CalculatorService);
	}

	@Test
	public void testAdd() {
		when(CalculatorService.add(5, 9)).thenReturn(13);
		assertEquals(26, employeeService.calSalary(5, 9));
		;
	}
}
