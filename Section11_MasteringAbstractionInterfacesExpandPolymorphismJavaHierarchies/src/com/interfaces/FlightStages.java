package com.interfaces;

public enum FlightStages implements ITrackable {

	GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

	@Override
	public void track() {
		if (this != GROUNDED) {
			System.out.println("Monitoring " + this);
		}
	}

	public FlightStages getNextStage() {

		FlightStages[] allStages = values();
		return allStages[(ordinal() + 1) % allStages.length];
	}

}
