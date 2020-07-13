package com.syntax.class21;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.breed="Something";
		a.color="Gray";
		a.paws=4;
		
		a.sleep();
		a.eat();
		
		
		Dog dog = new Dog();
		dog.breed="Husky";
		dog.color="Yellow";
		dog.paws=4;
		dog.tail=true;
		
		
		Cat cat = new Cat();
		cat.breed="";
		cat.color="Brown";
		cat.paws=4;
		cat.tail=true;
		cat.fur="";
		
		cat.purr();
		cat.eat();
		cat.sleep();
	}

}
