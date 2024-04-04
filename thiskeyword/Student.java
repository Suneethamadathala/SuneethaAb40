package thiskeyword;

public class Student 
{
 int age ;
 String name;
 double salary ;

 void student1(int age ,String name,double salary)
 {
	 this.name =name;
	 this.age =age ;
	 this.salary = salary;
	 System.out.println("my age is " + age + " and my name is "+ name + " and my salsry is " +salary);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.student1(21,"ram",57685.6);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.salary);
		
		
	}

}
