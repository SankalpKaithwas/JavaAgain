package com.interfaces;

public class Truck implements ITrackable {

	@Override
	public void track() {
		System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
	}

}
