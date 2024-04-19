package collecton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListProperties {

	public static void main(String[] args) 
	{
	  ArrayList a1= new ArrayList();
	  a1.add(100);
	  a1.add(0,"sunee1");
	  a1.add(300);
	  a1.add("ram");
	  System.out.println(a1);
	  a1.add(100);
	  a1.add(300);
	  System.out.println(a1.remove("                   ram"));
	  a1.add(500);
	  a1.add(600);
	  a1.add(100);
	  a1.add(10);
	  a1.add(null);
	  a1.add(500);
	  //Collections.sort(a1);
	  System.out.println(a1);
	 List l2= new ArrayList();
	 l2.add(400);
	 l2.add(800);
	 l2.add(800);
	l2.addAll(a1);
	System.out.println(l2.addAll(a1));
	System.out.println(a1.contains(400));
	System.out.println(l2.containsAll(a1));
 
    
	 
	  
	}

}

/*  1. ArrayList is indexed based 
 * 2.It will follow the order of insertion 
 * 3 .Its allows the duplication values
 * 4. Arraylist is dynamic in size 
 * 5.arraylist allows no of the null values
 * 6. ArrayList can be sorted using sort method using only homogeenous values
 * 7. arraylist  allows Hetrogenous */
