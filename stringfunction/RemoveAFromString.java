package stringfunction;

public class RemoveAFromString {

	public static void main(String[] args) 
	
	{
		String name = "SuNeetha123";
		String name1 ="";
		System.out.println(name.replace('a', ' ')); //remove a from the string 
		
		System.out.println(name.replace('a', 'n')); // replace a with n 
	
		System.out.println(name.replaceAll("[A-Z]",""));//Remove all Capital letters
		
		System.out.println(name.replaceAll("[a-z]", " "));//Remove all smallletters
      
		System.out.println(name.replaceAll("[A-Z]", "manish"));//Replce with capital letters with manish
		System.out.println(name.replaceAll("[0-9]", ""));//remove numerics
		System.out.println(name1.isEmpty());
		System.out.println(name.isEmpty());//whether it will check the given string is true or false
		System.out.println(name.lastIndexOf('3'));
		
	}

}
