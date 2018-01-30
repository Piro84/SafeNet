package safeNet;

import java.util.Scanner;

public class ATM {
	public static void main (String[] args) {
		
				Scanner input = new Scanner(System.in);
				int[] bills = new int[7];
				String command;
				String[] splitString;
				Commands controller = new Commands();
				for (int i = 0; i < 7; i++) {
					bills[i] = 10;
				}
				System.out.println("Press: \n'W <$amount>' to withdraw\n'R' to restock\n'I <denomonations>' to see the bills\n'Q' to quit the program");
				
				command = input.nextLine();
				
				while (!command.equals("Q")) {
					splitString = command.split(" ");
					if(splitString[0].equals("W")) {
						splitString[1] = splitString[1].substring(1);
						bills = controller.withdraw(splitString[1], bills);
						System.out.println();
						System.out.print("$1000 -" + bills[6] + "     ");
						System.out.println("$100 -" + bills[5] );
						System.out.print("$50 -" + bills[4] + "     ");
						System.out.println("$20 -" + bills[3]);
						System.out.print("$10 -" + bills[2] + "     ");
						System.out.println("$5 -" + bills[1]);
						System.out.print("$1 -" + bills[0] + "     ");
					}
					else if(splitString[0].equals("R")) {
						bills = controller.restock(bills);
						System.out.println();
						System.out.print("$100 -" + bills[5] + "     ");
						System.out.println("$50 -" + bills[4]);
						System.out.print("$20 -" + bills[3] + "     ");
						System.out.println("$10 -" + bills[2]);
						System.out.print("$5 -" + bills[1] + "     ");
						System.out.println("$1 -" + bills[0]);
					}
					else if(splitString[0].equals("I")) {
						controller.I(splitString, bills);
					}
					else {
						System.out.println("Failure:Invalid command");
					}
					System.out.println("\n\n\n\nPress:\n'W <$amount>' to withdraw\n'R' to restock\n'I <denomonations>' to see the bills\n'Q' to quit the program");
					command = input.nextLine();
				}
				System.out.println("Program terminated.");	

	}
}
