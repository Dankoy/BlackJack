package com.evcat.jack;

import java.util.*;
import com.evcat.jack.RandomGenerator;

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
		
		int sum = 0;
		System.out.println("For quit write \"q\"\n");
		while(in.nextLine() != "q") {
			
			if (sum > 21) {
				System.out.println("Your current points: " + sum);
				System.out.println("Yo lost!\nWanna try again?");
				sum = 0;
			} else if (sum == 21) {
				System.out.println("Congrats! You win!\n");
				sum = 0;
			}
			else if (sum < 21) {
				randomInt = bl.getRandomNumbers(START, END, randNumb);
				System.out.println("- " + randomInt + "\n");
				sum = sum + randomInt;
				System.out.println("Your current points: " + sum + "\n");
				System.out.println("Want one more card?\n");
			}
			String needSome = in.nextLine();
			switch (needSome.toLowerCase()) {
				case "yes":
					randomInt = bl.getRandomNumbers(START, END, randNumb);
					System.out.println(randomInt + "\n");
					sum = sum + randomInt;
					break;
				default:
					System.out.println("Your final points: " + sum + "\n");
					break;
			}
		}


		in.close();
		
	}
}
