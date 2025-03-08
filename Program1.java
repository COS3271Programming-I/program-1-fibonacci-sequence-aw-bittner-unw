// Program #1: Fibonacci App
package week_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {

	static Scanner inputscanner = new Scanner(System.in);

	public static void main(String[] args) {

//		Initialize/declare variables.
		int fibolen = 0;
		int[] fiboseq = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0 };
		ArrayList<String> fibosegt = new ArrayList<>();

//		Get user input.
		System.out.print("Welcome to the Fibonacci App! This program will print a portion of the Fibonacci Sequence"
				+ "to a specified length. Length\nmust be an integer between 1 and 32.\nEnter length of segment:"
				+ " ");
		while (fibolen < 1 || fibolen > 32) {
			fibolen = inputscanner.nextInt();
			if (fibolen < 1 || fibolen > 32) {
				System.out.print("Invalid input. Please enter an integer between 1 and 32: ");
			}
		}

//		Generate Fibonacci Sequence.
		for (int ind = 0; ind < fibolen; ind++) {
			if (ind > 1) {
				fiboseq[ind] = fiboseq[ind - 1] + fiboseq[ind - 2];
			} else {
				fiboseq[ind] = 1;
			}
			if (!(fiboseq[ind] == 0)) {
				fibosegt.add(Integer.toString(fiboseq[ind]));
			}
		}

//		Print sequence segment.
		System.out.format("Fibonacci sequence to %s numbers:\n\n%s", fibolen, String.join(", ", fibosegt));
		
//		End program. Used to keep window open when run from CLI.
		System.out.println("\n\nProgram finished. Press [enter] to close.");
		inputscanner.next();
	}
}