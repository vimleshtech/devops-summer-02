package day02;

public class ForLoop {

	public static void main(String[] args) {
	
		//wap to get sum of all even and odd numbers between 1 to 100
		int se,so;
		se=0;
		so =0;
		
		for(int i=1; i<=100;i++)
		{
			//System.out.println(i);
			if(i%2==0) //even 
			{
				se=se+i;
			}
			else 
			{
				so=so+i;
			}
		}
		
		System.out.println("sum of all even no :"+se);
		System.out.println("sum of all odd no :"+so);
		
		

	}

}
