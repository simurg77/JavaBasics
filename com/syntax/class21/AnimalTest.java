 package com.syntax.class21;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		//object of parent class has an access to all variables and methods of it is own class only
		Animal animal=new Animal();
		animal.breed="Something";
		animal.color="Gray";
		animal.paws=4;
		
		animal.sleep();
		animal.eat();
		
		//object of child class has an access to all var and methods of it is Parent and it is own Class
		Dog dog = new Dog();
		dog.breed="Husky";
		dog.color="Yellow";
		dog.paws=4;
		dog.tail=true;
		
		dog.eat();
		dog.sleep();
		dog.bark();
		
		Cat cat = new Cat();
		cat.breed="";
		cat.color="Brown";
		cat.paws=4;
		cat.tail=true;
		cat.fur="";
		
		cat.purr();
		cat.eat();
		cat.sleep();
		
		Kitten kit = new Kitten();
		kit.breed="Van";
		kit.color="White";
		kit.paws=4;
		kit.tail=true;
		
		kit.play();
		kit.purr();
		
	}

}
