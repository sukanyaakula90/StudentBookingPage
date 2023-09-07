package com.dakr.utils;

import org.springframework.stereotype.Component;

@Component
public class BookingIdUtils {

	public String generateSessionId() {
		return "Sri SaiNidi"+ Math.random();
	}
}
