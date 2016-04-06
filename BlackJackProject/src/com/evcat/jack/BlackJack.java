package com.evcat.jack;

import java.util.*;

public class BlackJack extends com.evcat.jack.RandomGenerator {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Wanna play?");
		System.out.println("Use only \"yes\" or \"no\".");
		
		String res = in.nextLine();
		
		switch(res.toLowerCase()) {
			case "yes":
			System.out.println("Good!\nSo begin!");
				break;
			case "no":
			System.out.println("Okay then!");
				return;
				
			default:
			System.out.println("Please use only \"yes\" or \"no\"! Thank you.");
				return;
		}

		Random randNumb = new Random();
		int randomInt = 0;
		final int START = 2;
		final int END = 11;
		
		RandomGenerator bl = new RandomGenerator();
		
		randomInt = bl.getRandomNumbers(START, END, randNumb);

		System.out.println(randomInt);

		in.close();
		
	}
}
