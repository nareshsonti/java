package com.employee.service;

/**
 * @author nsonti
 *
 */
public class EmployeeService 
{
	CalculatorService calculatorService;
	
	public EmployeeService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	public int calSalary(int i, int j) {

		return calculatorService.add(i, j) * 2;

	}
}
