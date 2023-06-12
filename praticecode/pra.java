package praticecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class pra 
{
	public static void main(String[] kk)
	{
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the size of the strings:");
		        int n = scanner.nextInt();
		        System.out.println("Enter " + n + " strings:");

		        String[] names = new String[n];
		        for (int i = 0; i < n; i++) {
		            names[i] = scanner.next();
		        }

		        System.out.println("String sorting");
		        System.out.println("1. By character    2. By string \n Enter your choice:");
		        
		        int sorted = scanner.nextInt();

		        if (sorted == 1) {
		            sortStringsByCharacter(names);
		        } else if (sorted == 2) {
		            sortStringsByString(names);
		        } else {
		            System.out.println("Invalid choice Sorting by characters by default.");
		            sortStringsByCharacter(names);
		        }
		    }

		    public static void sortStringsByCharacter(String[] names) {
		        for (int i = 0; i < names.length; i++) {
		            char[] characters = names[i].toCharArray();
		            Arrays.sort(characters);
		            names[i] = new String(characters);
		            System.out.println(names[i]);
		            //printASCIIValues(string);
		        }
		        System.out.println("Sum of ASCII values ");
		        for (int i = 0; i < names.length; i++)
		        {
		            int sum = 0;
		            for (int j = 0; j < names[i].length(); j++)
		            {
		                sum =sum+names[i].charAt(j);
		            }
		            System.out.println(names[i] + "    = " + sum);
		        }

		        
		    }

		    public static void sortStringsByString(String[] strings) 
		    {
		        Arrays.sort(strings);

		        System.out.println("Sorted strings by string:");
		        for (String string : strings) 
		        {
		            System.out.println(string);
		      

		        }
		        System.out.println("ASCII values");
		        for (int i = 0; i < strings.length; i++)
		        {
		            int sum = 0;
		            for (int j = 0; j < strings[i].length(); j++)
		            {
		                sum =sum+strings[i].charAt(j);
		            }
		            System.out.println(strings[i] + "   = " + sum);
		        }
		    }
}

