package com.qa.guesser;

import java.util.Scanner;

public class Game {

	public static void guesser() {
		RandomNumber randNo = new RandomNumber();
		int ourNumber = randNo.getRandomNumber();
		System.out.println(ourNumber);
		int lives = 7;
		int tries = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Try to guess the number:");
		int userInput = 0;
		boolean hasGuessed = false;
		
		while (!hasGuessed && lives > 0) {
			userInput = sc.nextInt();
			tries++;
			
			hasGuessed = userInput == ourNumber;
			if (!hasGuessed && --lives > 0) {
				System.out.printf("Wrong number! You have %d lives remaining\nGuess again:\n", lives);
			} 
		}

		if (hasGuessed) {
			System.out.printf("You guessed correctly! It took you %d tries.", tries);
		} else {
			System.out.printf("Ran out of lives! This took %d tries, better luck next time.", tries);
		}
		
		
	}

}
