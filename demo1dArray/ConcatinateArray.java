package demo1dArray;

public class ConcatinateArray {
	
	public static void main(String[] args)
	{
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		int b[]= {6,7,8,9,10};
		
		
		//print a array
		System.out.println("Array a elelments : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		
		//print b array
				System.out.println("Array b elelments : ");
				for(int i=0;i<b.length;i++)
				{
					System.out.print(b[i]+" ");
				}
				System.out.println();

		
		int c[]=new int[a.length+b.length];
		
		//combine two array in single array
		int index=0;
		//1st array
		for(int i=0;i<a.length;i++)
		{
			c[index++]=a[i];
		}
		
		//2nd array
		for(int i=0;i<b.length;i++)
		{
			c[index]=b[i];
			index++;
		}
		
		//print c array
		System.out.println("Array c elelments : ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
