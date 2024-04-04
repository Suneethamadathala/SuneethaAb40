package abstractpackage;
public class Stringexample 
{
	static void printfromreverse()
{
		String name="Suneetha";	
		for(int i=name.length()-1;i>=0;i--)
		{
			
			char a1=		name.charAt(i);
			System.out.print(a1);
		}
}
public static void main(String[] args) 
{
	
	printfromreverse();
	/*System.out.println("========================");
String name="Suneetha";	
for(int i=0;i<name.length();i++)
{
	
	char a1=		name.charAt(i);
	System.out.println(a1);
	}*/




}
}
