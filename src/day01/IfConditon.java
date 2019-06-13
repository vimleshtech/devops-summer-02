package day01;

import java.util.Scanner;

public class IfConditon {

	public static void main(String[] args) {

		int num;
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter no ");
		num= s.nextInt();
		
		
		//check even or odd
		if(num%2==0)
		{
			System.out.println("even no");
		}
		else {
			System.out.println("odd no");
		}
		
		
		
		//WAP show greater no from three inputs
		int a,b,c;
		System.out.println("enter no1");
		a= s.nextInt();
		
		System.out.println("enter no2");
		b= s.nextInt();
		
		System.out.println("enter no3");
		c= s.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c si greater");
		}

	}

}
