package com.syntax.class22_1;

import com.syntax.class21.Cat;
import com.syntax.class22.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Employee.companyName="Google";
		
		
		// new ScrumTeam();--> not visible from different package because it's default not public
		//new Cat(); //--> we can import this one because public..
		
		WaterFallTeam wt = new WaterFallTeam();
		WaterFallTeam.companyName="Amazon";
		
		
		
	}

}
