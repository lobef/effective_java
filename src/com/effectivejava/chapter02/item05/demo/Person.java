package com.effectivejava.chapter02.item05.demo;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 这两种创建的区别在于person中的isBabyBoomer，每次调用都会创建两个date对象，一个calendar对象，一个TimeZone对象
 * personal中的调用isBabyBoomer，每次调用，使用的都是同一个date对象，一个calendar对象，一个TimeZone对象，即这三个对象只实例化一次
 * personal中的对象推荐使用
 *
 */
public class Person {

	private final Date birthDay;

	public Person(Date birthDay) {
		this.birthDay = birthDay;
	}

	public boolean isBabyBoomer() {

		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = cal.getTime();
		cal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = cal.getTime();

		return birthDay.compareTo(boomStart) >= 0 && birthDay.compareTo(boomEnd) < 0;
	}

}

class Personal {

	private final Date birthDay;

	public Personal(Date birthDay) {
		this.birthDay = birthDay;
	}

	private static final Date boomStart;
	private static final Date boomEnd;
	static {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		boomStart = cal.getTime();
		cal.set(1956, Calendar.JANUARY, 1, 0, 0, 0);
		boomEnd = cal.getTime();
	}

	public boolean isBabyBoomer() {
		return birthDay.compareTo(boomStart) >= 0 && birthDay.compareTo(boomEnd) > 0;
	}

}
