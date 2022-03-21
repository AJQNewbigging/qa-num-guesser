package com.qa.guesser;

import java.util.Scanner;

public class Game {

	public static void guesser() {
		RandomNumber randNo = new RandomNumber();
		int ourNumber = randNo.getRandomNumber();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Try to guess the number");
		int userInput = sc.nextInt();
		System.out.println(userInput);
		
		while (userInput != ourNumber) {
			System.out.println("Wrong number guess again");
			userInput = sc.nextInt();
		}

		
		
		
	}

}
