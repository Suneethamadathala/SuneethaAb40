package forpackage;
public class Manish1Thread
{
public static void main(String[] args) throws InterruptedException
{
	for(int i=0;i<100;i++)
	{
		System.out.println(i);
		Thread.sleep(3000);
	}

;
}
}
