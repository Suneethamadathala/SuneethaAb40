package collecton;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListP
{

	public static void main(String[] args) 
	
	{
		LinkedList s1 = new LinkedList();
	
	s1.add(500);
	s1.add(300);
	//s1.add(null);
	s1.add(400);
	//s1.add("guru");
	
	
	Collections.sort(s1);//doesnot follow the sorting 
	System.out.println(s1);	
	}

}

/*  1. ArrayList is indexed based 
 * 2.It will follow the order of insertion 
 * 3 .Its allows the duplication values
 * 4. Arraylist is dynamic in size 
 * 5.arraylist allows no of the null values
 * 6. ArrayList can be sorted using sort method using only homogeenous values
 * 7. arraylist  allows Hetrogenous */

