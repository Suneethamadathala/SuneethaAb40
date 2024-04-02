package methodoverloading;

public class Functions 
{
 public void add()
 {
	System.out.println("1st method "); 
 }
 public int add (int a, int b)
 {
	 System.out.println(" 2nd method");
	return b;
	
	  
 }
 void add(char c,String name,boolean b)
 {
	 System.out.println("3 rd method ");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions f1 = new Functions();
		
		f1.add(10, 20);
		f1.add('i', "ram", true);
		f1.add();
	}
	

}
