package com.syntax.class22;

public class Employee {

	public static String companyName; // entire project
	protected String fullName; // same package unless inherited
	double salary; // same package
	private long ssn; // same class

	public void work() {
		System.out.println("All employee works");

	}

	public void getPaid() {
		System.out.println("All employee get paid");
	}

}

class ScrumTeam extends Employee {

	String ceremonies;

	void attendsmeetings() {
		System.out.println("attending every meeting");
	}

	void workOnBuildingSoftware() {
		System.out.println("working for build new product");
	}

}

class ProductOwner extends ScrumTeam {

	void communicate() {
		System.out.println("PO communicarting between client and team");
	}

	void prioritized() {
		System.out.println("PO is prioritizing the product backlog");
	}

}

class ScrumMaster extends ScrumTeam {
	String quality;
	
	void shieldTeam() {
		System.out.println("Scrum master is shielding the team");
	}

	void doMeetings() {
		System.out.println("Scrum master is responsible for doing all meeting");
	}

}

class Developer extends ScrumTeam {

	void code() {
		System.out.println("Developer is writing code");
	}

}

class Tester extends ScrumTeam {

	void test() {
		System.out.println("Tester is tests code, finds bugs, and report");
	}

}

class BussinessAnalyst extends ScrumTeam {

	void gatherRequirements() {
		System.out.println("BA gathering requirement");
	}

}
