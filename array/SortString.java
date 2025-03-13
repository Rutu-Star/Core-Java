package array;

import java.util.Arrays;

public class SortString {

	public static String sortingSring(String str)
	{
	
		char array[]=str.toCharArray();
		Arrays.sort(array);
		String str2=new String(array);
		
		return str2;
	}
	public static void main(String[] args)
	{
		String str="madam";
		System.out.println(sortingSring(str));
	}

}
