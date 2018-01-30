package safeNet;

import java.util.Scanner;

public class ATM {
	public static void main (String[] args) {
		
				Scanner input = new Scanner(System.in);
				int[] bills = new int[6];
				String command;
				String[] splitString;
				Commands controller = new Commands();
				for (int i = 0; i < 6; i++) {
					bills[i] = 10;
				}
				
				command = input.nextLine();
				
				while (!command.equals("Q")) {
					splitString = command.split(" ");
					if(splitString[0].equals("W")) {
						splitString[1] = splitString[1].substring(1);
						bills = controller.withdraw(splitString[1], bills);
						System.out.println("$100 -" + bills[5]);
						System.out.println("$50 -" + bills[4]);
						System.out.println("$20 -" + bills[3]);
						System.out.println("$10 -" + bills[2]);
						System.out.println("$5 -" + bills[1]);
						System.out.println("$1 -" + bills[0]);
					}
					else if(splitString[0].equals("R")) {
						bills = controller.restock(bills);
						System.out.println("$100 -" + bills[5]);
						System.out.println("$50 -" + bills[4]);
						System.out.println("$20 -" + bills[3]);
						System.out.println("$10 -" + bills[2]);
						System.out.println("$5 -" + bills[1]);
						System.out.println("$1 -" + bills[0]);
					}
					else if(splitString[0].equals("I")) {
						controller.I(splitString, bills);
					}
					else {
						System.out.println("Failure:Invalid command");
					}
					command = input.nextLine();
				}
				System.out.println("Program terminated.");	

	}
}
