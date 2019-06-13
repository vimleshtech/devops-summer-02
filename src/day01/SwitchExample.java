package day01;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day;
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter day no ");
		day = s.nextInt();
		
		switch (day) {
		
			case 1:
				System.out.println("monday");
				break;

			case 2:
				System.out.println("tuesday");
				break;
			
			default:
				System.out.println("no match");
				break;
		}
		
	}

}
