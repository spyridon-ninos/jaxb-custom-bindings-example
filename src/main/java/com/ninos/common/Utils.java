package com.ninos.common;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public final class Utils {

	private static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	public static LocalDate parseDate(String xmlGregorianCalendar) {
		return LocalDate.parse(xmlGregorianCalendar, dateFormatter);
	}

	public static String printDate(LocalDate localDate) {
		return localDate.format(dateFormatter);
	}

	public static LocalTime parseTime(String xmlGregorianCalendar) {
		return LocalTime.parse(xmlGregorianCalendar, timeFormatter);
	}

	public static String printTime(LocalTime localTime) {
		return localTime.format(timeFormatter);
	}
}
