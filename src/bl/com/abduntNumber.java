package bl.com;

import java.util.Scanner;

public class abduntNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int sum=0;
		for(int i=1;i<x;i++) {
			if(x%i==0) {
				sum=sum+i;
				
			}
		}
		if(sum>x) {
			System.out.println("abdunt number");
		}else {
			System.out.println("not abdunt number");
		}
	}

}
