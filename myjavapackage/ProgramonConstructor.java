package myjavapackage;

public class ProgramonConstructor {

	ProgramonConstructor() //Constructer has a classname with no returntype
	{
		System.out.println("iam a connstructor");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		
		ProgramonConstructor p1= new ProgramonConstructor();//By creating object automatically constuctor will cal
	}

}
