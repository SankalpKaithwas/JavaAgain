package com.list.linkedlist.challenge;

import java.util.LinkedList;

public class City {

	private LinkedList<String> town;
	private LinkedList<Integer> distanceFromSydney;

	public City() {

	}

	public LinkedList<String> getTown() {
		return town;
	}

	public void setTown(LinkedList<String> town) {
		this.town = town;
	}

	public LinkedList<Integer> getDistanceFromSydney() {
		return distanceFromSydney;
	}

	public void setDistanceFromSydney(LinkedList<Integer> distanceFromSydney) {
		this.distanceFromSydney = distanceFromSydney;
	}

	@Override
	public String toString() {
		return "City [town=" + town + ", distanceFromSydney=" + distanceFromSydney + "]";
	}

}
