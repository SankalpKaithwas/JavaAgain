package com.section5;

public class Exercise56 {

	public static String getDurationString(int seconds) {
		String duration = "";
		int minutes = 0;
		if (seconds >= 0) {
			if (seconds > 59) {
				minutes = seconds / 60;
				seconds %= 60;
				duration = getDurationString(minutes, seconds);
				return duration;

			} else {
				duration = getDurationString(minutes, seconds);
				return duration;
			}
		}
		return "Invalid Input";

	}

	public static String getDurationString(int minutes, int seconds) {
		int hours = 0;
		if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
			hours = minutes / 60;
			minutes %= 60;
			return "Hours: " + hours + " Minutes: " + minutes + " seconds: " + seconds;
		}
		return "Invalid Input";

	}
}
