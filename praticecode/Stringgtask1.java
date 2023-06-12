package praticecode;

import java.util.Scanner;

public class Stringgtask1 
{
	public static void main(String[] kk)
	{
		Scanner x=new Scanner(System.in);
		String []names=new String[5];
		System.out.println("Enter tha size of the string");
		int n=x.nextInt();
		System.out.println("Enter 5 strings");
		int i;
		for(i=0; i<5; i++)
		{
		  names[i]=x.next();
		}
	}

}
