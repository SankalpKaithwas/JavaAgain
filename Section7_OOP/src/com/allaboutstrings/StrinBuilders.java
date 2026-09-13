package com.allaboutstrings;

public class StrinBuilders {

	public static void main(String[] args) {
		String helloWorld = "Hello" + " World";
		helloWorld.concat(" and Goodbye");

		StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
		helloWorldBuilder.append(" and Goodbye");

		printInformation(helloWorld);
		/**
		 * string are immutable so when we concat (line 7) new object was created and
		 * thats why we dont see "and Goodbye" in output. SO we need to assign it to a
		 * variable first and then use/print that new variable
		 */
		String goodbye = helloWorld.concat(" and Goodbye");
		printInformation(goodbye);

		printInformation(helloWorldBuilder);

		StringBuilder emptyStart = new StringBuilder();
		emptyStart.append("a".repeat(57));

		StringBuilder emptyStart32 = new StringBuilder(32);
		emptyStart32.append("a".repeat(17));

		printInformation(emptyStart);
		printInformation(emptyStart32);

		StringBuilder builderPlus = new StringBuilder("Hello" + " World");
		builderPlus.append(" and Goodbye");

		builderPlus.deleteCharAt(16).insert(16, 'g');
		System.out.println(builderPlus);

		builderPlus.replace(16, 17, "G"); // replaces the index values with string
		System.out.println(builderPlus);

//        builderPlus.replace(16, 19, "G"); // replaces the index values with string
//        System.out.println(builderPlus);

		builderPlus.reverse().setLength(7);
		System.out.println(builderPlus);
	}

	public static void printInformation(String string) {

		System.out.println("String = " + string);
		System.out.println("length = " + string.length());
	}

	public static void printInformation(StringBuilder builder) {

		System.out.println("StringBuilder = " + builder);
		System.out.println("length = " + builder.length());
		System.out.println("capacity = " + builder.capacity());
	}

}
