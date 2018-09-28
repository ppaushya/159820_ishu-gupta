package org.cap;

import java.util.Scanner;

public class Examples {
int temp;
char[] a;
	
	public void AlphabetSoup(String str) {
		int k=str.length();
		a=new char[k];
		for(int i=0;i<str.length();i++)
		{
			a[i] =str.charAt(i);
		}
	}
	public void print() {
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	public void sort() {
		
int i,j;
char temp;
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
public void print1() {
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
	
	
	public static void main(String[] args) {
		Examples obj=new Examples();
		obj.AlphabetSoup("hello");
		obj.print();
		obj.sort();
		obj.print1();
		
	}

}
