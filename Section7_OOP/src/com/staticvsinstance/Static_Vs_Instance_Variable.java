package com.staticvsinstance;

public class Static_Vs_Instance_Variable {

	public static void main(String[] args) {
		Dog dog = new Dog("Pluto");

		Dog dog1 = new Dog("Pepsi");

		dog.printName(); // output Pepsi
		dog1.printName();// output Pepsi because we changed the only instance that was of class Dog as
							// its static

		Dog_Instance pluto = new Dog_Instance("Pluto");
		Dog_Instance pepsi = new Dog_Instance("Pepsi");

		pluto.printName();// output Pluto
		pepsi.printName();// output Pepsi  Becase we have two instances of class now as we are not using static

	}

}
