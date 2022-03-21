package com.qa.guesser;

import java.util.Scanner;

public class Game {

	public static void guesser() {
		RandomNumber randNo = new RandomNumber();
		int ourNumber = randNo.getRandomNumber();
		int lives = 7;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Try to guess the number:");
		int userInput = 0;
		boolean hasGuessed = false;
		
		while (!hasGuessed && lives > 0) {
			userInput = sc.nextInt();
			
			hasGuessed = userInput == ourNumber;
			if (!hasGuessed && --lives > 0) {
				System.out.printf("Wrong number! You have %d lives remaining\nGuess again:\n", lives);
			} 
		}

		if (hasGuessed) {
			System.out.println("You guessed correctly!");
		} else {
			System.out.println("Ran out of lives! Better luck next time.");
		}
		
		
	}

}
