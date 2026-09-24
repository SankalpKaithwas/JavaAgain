package com.interfaces;

public class Test {

	public static void main(String[] args) {
		inFlight(new Jet());
		
//		OrbitEarth.log("Testing " + new Satellite()); // if not private method then can call
		orbit(new Satellite());
		
	}

	private static void inFlight(IFlightEnabled flier) {

		flier.takeOff();
		flier.transition(FlightStages.LAUNCH);
		flier.fly();
		if (flier instanceof ITrackable tracked) {
			tracked.track();
		}
		flier.land();
	}
	
	private static void orbit(IOrbitEarth flier) {

        flier.takeOff();
        flier.fly();
        flier.land();
    }

}
