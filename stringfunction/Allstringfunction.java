package stringfunction;

public class Allstringfunction 
{
public static void main(String[] args) 
{
	 String name ="Suneetha";
	 String name1 = "I am suneetha";
	 
	
	 int  s = name.length();//length of a string 
	 System.out.println(s);
	 char s2 = name.charAt(4);//find the index of char 
     System.out.println(s2);
     boolean b= name.equals("suneetha");
     System.out.println(b); 
    /* if(name.equals("suneetha"))
     {
     System.out.println(true);
     }
     else 
     {
    	 System.out.println(false);
     } */ // comparing the string 
     for (int i=0;i<name.length();i++) // string this display vertically
     {
    	 
    	 System.out.println(name.charAt(i));
    	 
    }
     System.out.println();
     
     for(int i=name.length()-1;i>=0;i--) 
     {
    	 System.out.println(name.charAt(i)); // reverse the String verrtically
    	 
     }
     if(name.equals(name1))
     {
    	 System.out.println("print names mathes");
     }
     else 
     {
    	 System.out.println("print doesnot match");
     }
     
    System.out.println(name.toLowerCase()); 
    System.out.println(name.toUpperCase());
    
    System.out.println(name.contains("am"));
    System.out.println(name.substring(4));
    System.out.println(name1.substring(5, 8));
    System.out.println(name1.indexOf('a'));
    
    System.out.println(name.concat(" ").concat(name1));
    String name3 = "  suneetha";
    System.out.println(name3.trim());
    
      
}
}
