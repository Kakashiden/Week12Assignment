package com.promineotech;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;


public class TestDemo {

	public TestDemo() {

	}

	public int addPositive(int a, int b) {
		if (a > 0 && b > 0) {
			return a + b;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	
	public BigDecimal averageOfArray(double[] arr) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("Array must have values.");
		}
		
		double sum = 0;
		for (double num : arr) {
			sum += num;
		}
		double avg = sum / arr.length;
		
		return new BigDecimal(avg).setScale(2, RoundingMode.HALF_DOWN);
	}

	int randomNumberSquared() {
		int randomInt = getRandomInt();
		return (randomInt * randomInt);
	}

	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;

	}

	
}
