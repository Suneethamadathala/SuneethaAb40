package stringfunction;

import java.util.Arrays;

public class CopytheoneArray_toAnotherArray {

	public static void main(String[] args) 
	{
		int val1[] = new int[4];
		int val[] = new int[4];
		 val[0] =10;
		 val[1] =20;
		 val[2]=30;
		 val[3]=40;
		 for (int i=0 ;i<val.length;i++)
		 {
			 val1[i]=val[i];
		 }
		 System.out.println("original values are "+ Arrays.toString(val));
		 System.out.println("assigned values are "+ Arrays.toString(val1));
		 
		
	}

}
