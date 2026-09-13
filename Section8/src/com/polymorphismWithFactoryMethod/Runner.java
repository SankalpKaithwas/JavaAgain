package com.polymorphismWithFactoryMethod;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
//		Movie theMovie = new Movie("Star Wars");
//		Movie adventureMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();
//        adventureMovie.watchMovie();

//		Movie movie = Movie.getMovie("Adventure", "Star Trek");
//		movie.watchMovie();
//		Movie movie1 = Movie.getMovie("Science Fiction", "Star Trek");
//		movie1.watchMovie();

		try (Scanner s = new Scanner(System.in)) {
			while (true) {
				System.out.print(
						"Enter Type (A for Adventure, C for Comedy, " + "S for Science Fiction, or Q to quit): ");
				String type = s.nextLine();
				if ("Qq".contains(type)) {
					break;
				}
				System.out.print("Enter Movie Title: ");
				String title = s.nextLine();
				Movie movie = Movie.getMovie(type, title); // return instance of class based on character
				movie.watchMovie();
			}
		}

	}

}
