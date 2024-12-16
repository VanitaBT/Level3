package bl.com;

import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int i=sc.nextInt();
	int temp=i;
	int sum=0;
	
	while(i>0) {
		int d=i%10;
		sum=sum+d;
		i=i/10;
	}
	
	int x=temp%sum;
	if(x==0) {
		System.out.println("the number is harshad number");
	}else {
		System.out.println("not harshad number");
	}
	
	
	}
	

}
