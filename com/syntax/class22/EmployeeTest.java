package com.syntax.class22;

public class EmployeeTest {
	public static void main(String[] args) {
		
	ScrumTeam obj1 = new ScrumTeam();
	ScrumTeam.companyName="Facebook";
	obj1.fullName="Ahmet Demir";
	obj1.salary=8000;
	//obj1.ssn --> not visible
	obj1.getPaid();
	obj1.work();
	
	obj1.attendsmeetings();
	obj1.ceremonies="Scrum meetings";
	obj1.workOnBuildingSoftware();
	
	ProductOwner obj2 = new ProductOwner();
	//ProductOwner.companyName grandchild have an acces
	obj2.salary=10000;
	obj2.getPaid();
	obj2.work();
	
	obj2.ceremonies="Scrum meetings";
	obj2.attendsmeetings();
	obj2.workOnBuildingSoftware();
	
	obj2.communicate();
	
	}
	

}
