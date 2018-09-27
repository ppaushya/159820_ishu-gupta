package org.cap.demo;

import java.util.Scanner;

public class Demo3 {
	int[][] a;
	
	
	Scanner scanner=new Scanner(System.in);
	
	
	
	public void getMatrix() {
		System.out.println("enter the size of square matrix");
		int s=scanner.nextInt();
		a=new int[s][s];
	System.out.println("enter the values");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			a[i][j]=scanner.nextInt();
		}
	}
	
	
	}
	
	public void printData() {
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}System.out.println();
		}
		
	}
	
	public void getUpper() {
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i>=j)
				System.out.print(a[i][j]+"\t");
			}System.out.println();
		}
		
		
		
	}
	public void getLower() {
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i<=j)
				System.out.print(a[i][j]+"\t");
			}System.out.println();
		}
		
		
	}
	
	public void transpose() {
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				System.out.print(a[j][i]+"\t");
			}System.out.println();
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		obj.getMatrix();
		obj.printData();
		obj.getUpper();
		obj.getLower();
		obj.transpose();

	}

}
