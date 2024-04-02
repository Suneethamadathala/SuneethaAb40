package arrays;

public class PrintStudent
{
	  public static void main(String[] args) {
	        // Define student data
		  String names[] = new String[5];
			names[0]="Kushal";
			names[1]="Kushsal p ";
			names[2]="verma";
			names[3]="Monica Ravat";
			names[4]="Vishal Prasad";
		  int values[] = new int[5];
			values[0]=1;
			values[1]=2;
			values[2]=3;
			values[3]=4;
			values[4]=5;
			//String a = values.toString();
			
			//String  b= names.toString();
			 char[] gender =new char[5];
				gender[0]='M';
				gender[1]='M';
				gender[2]='M';
				gender[3]='F';
				gender[4]='M';
				//String c= gender.toString();
				long[] mobilenumber = new long[5];
				mobilenumber[0]=9998574;
				mobilenumber[1]=857412;
				mobilenumber[2]=857421;
				mobilenumber[3]=96851;
				mobilenumber[4]=967452;
				//String d = mobilenumber.toString();
	       
	        
	        // Print table header
	        System.out.println("Student Table");
	        System.out.println("studentname\trollno\tgender\tmobilenumber");
	        // Print each student's data
	        for (int i = 0; i <names.length; i++) 
	        {
	        	String s= names[i];
	        	 // Adjust spacing for longer names
	        	if (s.length()>=12) 
	        	{
	                s = s+"\t\t\t\t\t\t";
	            } 
	        	else 
	        	{
	                s += "\t\t\t";
	            }
	           System.out.println(names[i] + "\t"+ values[i] +"\t"+ gender[i] + "\t " +mobilenumber[i]);
	        	//System.out.println(a.concat(b).concat("  " ).concat(c).concat(" ").concat(d));
	            
	        }
	    }
	
	}


