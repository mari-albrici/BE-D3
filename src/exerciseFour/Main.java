package exerciseFour;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		timer();
	}
	
	public static void timer() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write a number:");
		
		int number = input.nextInt();
		
		for (int i = number; i>= 0; i--) {
			System.out.println(i);
		}
		
		input.close();
	}

}
