package com.bridgelab;

public class SnakeAndLadder {
	public static final int No_play = 0;
	public static final int Ladder = 1;
	public static final int Snake = 2;
	public static final int Start = 0;

	public static void main(String[] args) {
		int pos = 0, cntr1 = 0, cntr2 = 0, cntr3 = 0, cntr4 = 0;
		System.out.println("Starting position of player is: " + Start);
		while (pos < 100) {
			int roll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			cntr1++;
			System.out.println("Number on rolled dice is : " + roll);
			int con = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println("Condition: " + con);
			switch (con) {
			case No_play:
				System.out.println("New Position is: " + pos);
				cntr4++;
				break;
			case Ladder:
				pos = pos + roll;
				if (pos <= 100)
					System.out.println("New Position is: " + pos);
				else {
					pos = pos - roll;
					System.out.println("Remains at same position: " + pos);
				}
				cntr2++;
				break;
			case Snake:
				pos = pos - roll;
				if (pos <= 100) {
					if (pos >= 0) {
						System.out.println("New Position is: " + pos);
					} else {
						pos = 0;
						System.out.println("New Position is: " + pos);
					}
				} else {
					System.out.println("New position is:" + pos);
				}
				cntr3++;
				break;
			default:
				System.out.println("Default");
				break;
			}
		}
		System.out.println();
		System.out.println("Player ROLLED DICE " + cntr1 + " time and got SNAKE " + cntr3 + " times and got LADDER "
				+ cntr2 + " times and got NO PLAY " + cntr4 + " times to win the game");
		if (pos == 100)

			System.out.println("PLAYER WON");
	}
}
