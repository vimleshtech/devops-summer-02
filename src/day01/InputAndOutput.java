package day01;

import java.util.Scanner;

public class InputAndOutput {

	public static void main(String[] args) {

		//\t : tab
		//\n : new line
		System.out.println("H\ti");
		System.out.println("Ram\nan");

		//
		System.out.print("Hi");
		System.out.println("Raman");


		//create object of Scanner Class
		Scanner s = new Scanner(System.in);
		String name;
		
		System.out.println("enter name :");
		//name =s.nextLine();
		name =s.next();
		
		System.out.println("your name is "+name);
		
		
		int a,b,c;
		System.out.println("enter number 1 ");
		a = s.nextInt();
		
		
		System.out.println("enter number 2 ");
		b = s.nextInt();
		
		
		//addition 
		c =a+b;
		System.out.println("sum of two numebrs :"+c);
		
				
		
		
		
		
		
	}

}
