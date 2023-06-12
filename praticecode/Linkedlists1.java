package praticecode;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlists1 
{
   private static int From;
private static int to;
private static Integer[] cc;

public  static void main( String[] kk)
   {
	   		String[] names1= {"aa","bbb","ccc","xxxx","yyy","zzzz","red","blue","pink"};
	   		//create linkedlist object
	   		LinkedList<String>list1=new LinkedList<String>();
	   		//add strings(names) to list object using collection method (add())
	   		for(String x:names1)
	   		{
	   			list1.add(x);
	   		}
	   		System.out.println("list1_"+list1);
	   		String[] name2= {"zzzz","ee","aa","dd","ccc","gg","pp"};
	   		//create linkedlist object
	   		LinkedList<String>list2=new LinkedList<String>();
	   		//add strings (names)to list object using collection method (add())
	   		for(String s:name2)
	   		{
	   			list2.add(s);
	   		}
	   		System.out.println("list2_"+list2);
	   		
	   		//remove duplicates from list1 after compare with list2
	   		Printlist1(list1);
	   		check_duplicates (list1,list2);
	   		System.out.println("\n after removing duplicates from lis_1"+list1);
	   		list1.addAll(list2);
	   		System.out.println("After adding data from list1_"+list1);
	   		//clear list2 data
	   		list2=null;
	   		System.out.println("list2_"+list2);
	   		//user defined methods
	   		remove_from_list1(list1,1,5);
	   		printlist1(list1);
	   		printList1_reverse(list1);
	   		
   }
   //main close 
   //check_duplicates
	   		
	   		
	   		
   private static void printlist1(LinkedList<String> list1)
   {
	   System.out.println("\n from printlist:");
		  for(String s:list1)
		  {
			  System.out.printf("%s",s);
		  }
		
	     
   }



private static void printList1_reverse(LinkedList<String> list1) 
   {
	  ListIterator it=list1.listIterator(list1.size());
	  System.out.println("\n reverse list: ");
	  while(it.hasPrevious())
	  {
		  System.out.printf("%s",it.previous());
	  }
	  Integer[] b= {5,6,4};
	  Character[] cc= {'c','f','v'};
	  //print (names1);
	  print(b);
	  print(cc);
		  
	  }
//generic method//<t.=generic type
private static <T> void print(T[] x)
{
	for(T s:x)
	{
		System.out.printf("%s\n",s);
}
}






private static void remove_from_list1(LinkedList<String> list1, int i, int j)
{
   
	list1.subList(From, to).clear();
	
}

private static void check_duplicates(LinkedList<String> list1, LinkedList<String> list2)
{
	//list.hasx
	//iteration
	ListIterator it=list1.listIterator();
	while(it.hasNext())//checks row
	{
		if(list2.contains(it.next()))
		{
			it.remove();
		}
	}
}
private static Object duplicates(LinkedList<String> list1, LinkedList<String> list2) {

	return null;
}

private static void Printlist1(LinkedList<String> list1) {

	
}
}
