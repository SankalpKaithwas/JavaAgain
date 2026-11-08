package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
	
	public record Person(String firstName, String lastName) {
		/**
		 * records are implicitly static when used as a inner class, in the same way
		 * Enums and Interfaces are
		 */
		@Override
		public String toString() {
			return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
	};

	public static void main(String[] args) {
		
		List<Person> person = new ArrayList<>(Arrays.asList(
				new Runner.Person("Emma", "Black"),				
				new Person("Harry", "Osborn"),
				new Runner.Person("Adam", "Black"),
				new Person("Mary", "Jane"),
				new Person("Tessa", "May")));
		
//		var compareLastName = new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {				
//				return o1.lastName().compareTo(o2.lastName());
//			}
//			// having same last name = sort in insertion order
//		};		
//		person.sort(compareLastName);
		// above can be changed to below
//		person.sort(new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {				
//				return o1.lastName().compareTo(o2.lastName());
//			}
//			// having same last name = sort in insertion order
//		});
		// above can be changed to below
		person.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
		
		
		System.out.println(person);
	}
	
/** For a lambda expression, the method is inferred by Java!
 * A functional interface is an interface that has one, and only one, abstract method.
 * This is how Java can infer the method to derive the parameters and return type, for the lambda expression.
 * You may also see this referred to as SAM, which is short for Single Abstract Method, 
 * which is called the functional method.
 * A functional interface is the target type for a lambda expression.*/

}
