package encapsulation;

public class login 
{
	private String emailid ="contact@gmail.com";
	
	public String getemailid()
	{
		return emailid;
	}
	public void setemailid(String emailid)
	{
		this.emailid =emailid;
	}
	
	private String password = "sune123";
	
	private int age =20;
	

	public static void main(String[] args) 
	{
		login l1 = new login();
		l1.setemailid("suneetha@gmail.com");
		System.out.println(l1.getemailid());
		l1.setPassword("retturn");
		System.out.println(l1.getPassword());
		l1.setAge(10);
		System.out.println(l1.getAge());
	

	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
