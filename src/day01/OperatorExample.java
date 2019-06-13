package day01;

public class OperatorExample {

	public static void main(String[] args) {
		
		int n=23;
		
		int o1,o2;
		
		o1 = n/10;
		o2 = n%10;
		
		System.out.println("divisor is "+o1);  //2
		System.out.println(o2); //3
		
		//increment and decrement
		int i,j;
		i=0;
		j=0;
		
		System.out.println(i++);//0
		System.out.println(++j);//1
		
		System.out.println(i);//1
		System.out.println(j);//1
		
		//Assignment
		int a;
		a =10;
		System.out.println(a);
		a+=1;//a=a+1
		System.out.println(a);
		
		
	}

}
