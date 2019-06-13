package student;

import java.util.Scanner;

public class student {
	public static void main(String[] args) {

		int s1,s2,s3,s4,s5;
		System.out.println("Marks of all subjects");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter mark in Hindi");
		s1 = sc.nextInt();
		System.out.println("enter mark in English");
		s2 = sc.nextInt();
		System.out.println("enter mark in Maths");
		s3 = sc.nextInt();	
		System.out.println("enter mark in Science");
		s4 = sc.nextInt();
		System.out.println("enter mark in French");
		s5 = sc.nextInt();
		
		int ptg;
		ptg=(s1+s2+s3+s4+s5)/ 5;
		
		if(ptg>60) 
		{
				System.out.println("first divison"+ptg);
		}
		else if(ptg>50 && ptg<59)
		{ 
			System.out.println("second divison"+ptg);
		}
		else if(ptg>40 && ptg<49)
		{ 
				System.out.println("third divison"+ptg);
		}
		else //(ptg<40)
		{ 
			System.out.println("fail"+ptg);
		}
	}

}

