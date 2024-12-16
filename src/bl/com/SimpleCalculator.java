package bl.com;
import java.util.*;
public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first value");
		double first=sc.nextDouble();
		System.out.println("Enter second value");
		double second=sc.nextDouble();
		System.out.println("Enter operations");
		String op=sc.next();
		
		switch(op) {
		case "+":
			double result=first+second;
			System.out.println(result);
			break;
			
		case "-":
			double result1=first-second;
			System.out.println(result1);
			break;
			
		case "*":
			double result2=first*second;
			System.out.println(result2);
			break;
			
		case "/":
			double result3=first/second;
			System.out.println(result3);
			
		
		}
		
	}

}
