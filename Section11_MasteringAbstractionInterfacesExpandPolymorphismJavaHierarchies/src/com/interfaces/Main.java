package com.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Bird bird = new Bird();
		Animal animal = bird;
		IFlightEnabled flier = bird;
		ITrackable tracked = bird;
//		bird.move();
		animal.move();
//        flier.move();
//        tracked.move();

		/*
		 * flier.takeOff(); flier.fly(); tracked.track(); flier.land();
		 */

		inFlight(flier);
		inFlight(new Jet());
		ITrackable truck = new Truck();
		truck.track();

		double kmsTraveled = 100;
		double milesTraveled = kmsTraveled * IFlightEnabled.KM_TO_MILES;
		System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

		ArrayList<IFlightEnabled> fliers = new ArrayList<IFlightEnabled>(); // The methods will have to take type of
																			// ArrayList<FlightEnabled>   
		fliers.add(bird);
		List<IFlightEnabled> betterFliers = new ArrayList<IFlightEnabled>(); // BETTER WAY cause you can just pass any
																			// "type" of list
		betterFliers.add(bird);

		List<IFlightEnabled> betterFliersLinked = new LinkedList<IFlightEnabled>(); // BETTER WAY cause you can just pass
																					// any "type" of list
		betterFliers.add(bird);
		triggerFliers(fliers);
		flyFliers(fliers);
		landFliers(fliers);

		triggerFliers(betterFliers);
		flyFliers(betterFliers);
		landFliers(betterFliers);

		triggerFliers(betterFliersLinked);
		flyFliers(betterFliersLinked);
		landFliers(betterFliersLinked);

	}

	private static void triggerFliers(List<IFlightEnabled> fliers) {

		for (var flier : fliers) {
			flier.takeOff();
		}
	}

	/** BAD WAY As it can only take type ArrayList<FlightEnabled> */
//	private static void triggerFliers(ArrayList<FlightEnabled> fliers) {
//		
//		for (var flier : fliers) {
//			flier.takeOff();
//		}
//	}

	private static void flyFliers(List<IFlightEnabled> fliers) {

		for (var flier : fliers) {
			flier.fly();
		}
	}

	private static void landFliers(List<IFlightEnabled> fliers) {

		for (var flier : fliers) {
			flier.land();
		}
	}

	private static void inFlight(IFlightEnabled flier) {

		flier.takeOff();
		flier.fly();
		if (flier instanceof ITrackable tracked) {
			tracked.track();
		}
		flier.land();
	}

}
