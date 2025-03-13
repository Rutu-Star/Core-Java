package stringdemo;

public class StringBufferMethod {
	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("Rutuja");
		System.out.println(s1);
		String s4=new String("Rutuja");
		String s5=new String("Rutuja");
		
		StringBuffer s3=new StringBuffer("Rutuja");
		System.out.println(s3);
		
		System.out.println(s1.equals(s3));//false //euals() methods not override in stringbuffer
		System.out.println(s4.equals(s5));//true //euals() methods  override in string class
		System.out.println(s4==s5);//false
		System.out.println(s1==s3);//false
		System.out.println(s1.compareTo(s3));//0
		System.out.println(s4.compareTo(s5));//0
		System.out.println(s1.indexOf("u"));
		System.out.println(s1.lastIndexOf("u"));
		
		char ch[]=s4.toCharArray();
		for(int i=0;i<s4.length();i++)
		{
			System.out.println(ch[i]);
		}
		



		

		


		
		
		System.out.println();
		System.out.println(s1.capacity());

		StringBuffer s2=new StringBuffer();
		s2=s2.append("Rutuja");
		System.out.println(s2);
		System.out.println(s2.capacity());
		s2=s2.append("Sandhya Sayali Sakshi ");
		System.out.println(s2.capacity());
		
		StringBuffer str=new StringBuffer(10);
		str.append("Sayali");
		System.out.println(str);
		System.out.println(str.capacity());

		
		
		
	




		
	}

}
