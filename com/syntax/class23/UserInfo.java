package com.syntax.class23;

class UserInfo extends UserClass{
	
	String adress;
	
	public UserInfo(String name, int mobileNum, String adress) {
		super(name, mobileNum);
		this.adress=adress;
	}
	
	public void userDetails() {
		System.out.println("User name is "+name+" and mobile number is "
				+mobileNum+" user lives in "+adress);
	}
	
	public static void main(String[] args) {
		
		UserInfo obj = new UserInfo("Emma", 23245674, "Pittsburgh, PA");
		obj.userDetails();
	}
	
	

}
