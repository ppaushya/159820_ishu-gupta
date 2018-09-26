package cap.org.demo;

import java.util.Scanner;

public class sumOfDigit {
	int number,digit,sum;

	public void getNumber() {
	Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number:");
   	  number=scanner.nextInt();
   	  scanner.close();
	} 
   	  public void getSum( ) {
   		 while (number > 0)
   	    {
   	        digit = number % 10;
   	        sum  = sum + digit;
   	        number /= 10;
   	    }
   		 System.out.println(sum);
   	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 sumOfDigit obj=new sumOfDigit();
 obj.getNumber();
 obj.getSum();
 
	}

}
