package com.bridgelab;

public class SnakeAndLadder {
	public static void main(String[] Args) {

		int start = 0;
		System.out.println("The start position :" + start);
		int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("After rolling the dice : " + roll);
	}
}