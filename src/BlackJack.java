import java.util.*;
import java.io.*;

public class BlackJack {
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

		//Logic here
		
	}
}
