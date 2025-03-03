package com.diwakartech.lc.services;

public class ResultCalculateImpl implements ResultCalculate {

	@Override
	public String calculator(String yourName, String crushName) {
		int namesLength = (yourName + crushName).length();
		char result = flamescalculator(namesLength);
		return FlamesResult.result;
	}

	// devloper helping methods
	public static char flamescalculator(int namesLength) {

		String flam = "FLAMES";
		int flameslength = flam.length();
		int f_result = namesLength % flameslength;
		return flam.charAt(f_result);

	}

}
