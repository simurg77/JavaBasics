package com.syntax.class22_1;

import com.syntax.class22.Employee;

public class WaterFallTeam extends Employee {

	public void slowWork() {

	}

	public static void main(String[] args) {

		WaterFallTeam wt = new WaterFallTeam();
		WaterFallTeam.companyName = "Instagram";
		wt.fullName = "Ahmet Bicer"; // protected variable is accessible to different package
		System.out.println(wt.fullName);
		
		Employee emp = new Employee();

	}

}
