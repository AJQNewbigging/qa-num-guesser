package com.qa.guesser;

import java.util.Random;

public class RandomNumber {
	Random rand = new Random();
	int upperbound = 101;
	
	public int getRandomNumber() {
		int output = rand.nextInt(upperbound);
		return output;
	}
	
}
