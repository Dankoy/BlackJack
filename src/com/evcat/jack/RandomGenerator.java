package com.evcat.jack;

import java.util.Random;

public class RandomGenerator {	

	public int getRandomNumbers(int aStart, int aEnd, Random aRandom){
		if (aStart > aEnd) {
			throw new IllegalArgumentException("Start cannot exceed End.");
		}
		long range = (long)aEnd - (long)aStart + 1;
		long fraction = (long)(range * aRandom.nextDouble());
		int randomNumber = (int)(fraction + aStart);
		return randomNumber;
	}
}
