package interviewprogram1;

public class ReverseStringUsingStringBuffer {

	public static void main(String[] args) 
	{

       String str ="automation";
       StringBuilder str1= new StringBuilder();
       str1.append(str);
       str1 = str1.reverse();//used string builder to reverse the string
       System.out.println(str1);
       
       

	}

}
