package com.extendss;

public class ExtendsRunner {

	public static void main(String[] args) {
		Mammal cat = new Cat();
		cat.voice();
		System.out.println(cat.eat("Fish"));
	}

}
