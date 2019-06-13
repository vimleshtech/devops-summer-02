package day02;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=10)
		{
			
			//System.out.println(i);
			System.out.print(i+",");
			i++;
		}
		
		//print in reverse order
		i=10;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
		
		//print all odd numbers between 1 to 30
		i =1;
		while(i<=30)
		{
			System.out.println(i);
			i+=2;
		}
		
		
		//wap to print table of given no
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data ");
		n = sc.nextInt();
		
		i=1;
		while(i<=10)
		{
			
			System.out.println(n*i);
			i++;
		}
		
		
	}

}
