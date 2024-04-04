package stringfunction;

import java.util.Arrays;

public class SpecialCharacter {

	public static void main(String[] args) 
	{
		boolean b;
		
      String  speci = "sunetha123#&^$456u  55  th  &";
		 String sr =speci.replaceAll(" ","");
      
   // char[] al = speci.toCharArray();
      
      System.out.println("print specialchjaracterin the given string");
      for (int i=0; i<speci.length();i++)
      {
    	  
                  char ch =sr.charAt(i);
    	 b = Character.isLetterOrDigit(ch);
    
    	 if(b==false)
    	 {

    		 System.out.println(ch);
    	 }
    	 
    	 
      }
     
      
      }

}
	


