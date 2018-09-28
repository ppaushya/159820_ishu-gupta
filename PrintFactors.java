package org.cap;

public class PrintFactors {
	
	public void prime(int n) {
		
		int k=n;
		for(int i=2;i<k;i++)
		{
			while(n%i==0)
			{
				n=n/i;
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		PrintFactors obj=new PrintFactors();
		obj.prime(475);
	}

}
