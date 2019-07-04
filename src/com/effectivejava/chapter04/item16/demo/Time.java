package com.effectivejava.chapter04.item16.demo;

public class Time {

	private static final int HOUR_PER_DAY = 24;
	private static final int MINUTE_PER_HOUR = 60;

	public final int hour;
	public final int minute;

	public Time(int hour, int minute) {
		if (hour < 0 || hour >= HOUR_PER_DAY) {
			throw new IllegalArgumentException("Hour: " + hour);
		}
		if (minute < 0 || minute >= MINUTE_PER_HOUR) {
			throw new IllegalArgumentException("Minute: " + minute);
		}
		this.hour = hour;
		this.minute = minute;
	}

}
