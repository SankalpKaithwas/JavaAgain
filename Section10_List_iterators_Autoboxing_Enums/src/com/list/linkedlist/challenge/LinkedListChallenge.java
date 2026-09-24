package com.list.linkedlist.challenge;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListChallenge {

	public static void main(String[] args) {
//		Tims way
		LinkedList<Place> places = new LinkedList<>();
		Place adelaide = new Place("Adelaide", 1374);
		addPlace(places, adelaide);
		addPlace(places, new Place("adelaide", 1374));
		addPlace(places, new Place("Adelaide", 1374));
		addPlace(places, new Place("Brisbane", 917));
		addPlace(places, new Place("Perth", 3923));
		addPlace(places, new Place("Alice Springs", 2771));
		addPlace(places, new Place("Darwin", 3972));
		addPlace(places, new Place("Melbourne", 877));
		places.addFirst(new Place("Sydney", 0));
		System.out.println(places);
		boolean quitLoop = false;
		boolean forward = true;
		var iterator = places.listIterator();
		printMenu();
		try (Scanner scanner = new Scanner(System.in)) {

			while (!quitLoop) {
				if (!iterator.hasPrevious()) {
					System.out.println("Originating : " + iterator.next());
					forward = true;
				}
				if (!iterator.hasNext()) {
					System.out.println("Final : " + iterator.previous());
					forward = false;
				}
				System.out.println("Enter Value: ");
				String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

				switch (menuItem) {
				case "F":
					System.out.println("User wants to go forward");
					if (!forward) { // Reversing Direction
						forward = true;
						if (iterator.hasNext()) {
							iterator.next(); // Adjust position forward
						}
					}

					if (iterator.hasNext()) {
						System.out.println(iterator.next());
					}

					break;

				case "B":
					System.out.println("User wants to go backwards");
					if (forward) { // Reversing Direction
						forward = false;
						if (iterator.hasPrevious()) {
							iterator.previous(); // Adjust position forward
						}
					}
					
					if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
					break;
				case "L":
					System.out.println(places);
					break;
				case "M":
					printMenu();
					break;
				default:
					quitLoop = true;
					break;
				}
			}
		}

	}

	private static void addPlace(LinkedList<Place> list, Place place) {

//		if (list.contains(place)) {
//			System.out.println("Found duplicate: " + place);
//			return;
//		}

		for (Place p : list) {
			if (p.name().equalsIgnoreCase(place.name())) {
				System.out.println("Found duplicate: " + place);
				return;
			}
		}

		int matchedIndex = 0;
		for (var listPlace : list) {
			if (place.distance() < listPlace.distance()) {
				list.add(matchedIndex, place);
				return;
			}

			matchedIndex++;
		}

		list.add(place);
	}

	private static void printMenu() {

		System.out.println("""
				Available actions (select word or letter):
				(F)orward
				(B)ackwards
				(L)ist Places
				(M)enu
				(Q)uit""");
	}

	// incomplete
	public void myWay() {
		City city = new City();
		LinkedList<String> places = new LinkedList<>();
		places.addAll(List.of("Adelaide", "Alice springs", "Brisbon", "Darwin", "Melbourne", "Perth"));
		LinkedList<Integer> distance = new LinkedList<>();
		distance.addAll(List.of(1374, 2771, 917, 3972, 877, 3923));
		city.setDistanceFromSydney(distance);
		city.setTown(places);

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.printf("""
						Avaialble Actions:
							(F)orward
							(B)ackword
							(L)Ist Places
							(M)enu
							(Q)uit""");
				// for text blocks you need to have *** on the first line only and ending ***
				// can be on new line Or on the same ending text line
				String input = scanner.nextLine();
				if (input.toLowerCase() == "q") {
					break;
				}
				ListIterator<String> it = city.getTown().listIterator();
				ListIterator<Integer> dist = city.getDistanceFromSydney().listIterator();
				while (it.hasNext()) {

				}
			}
		}
	}

}
