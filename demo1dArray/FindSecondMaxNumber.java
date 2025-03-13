package demo1dArray;

public class FindSecondMaxNumber {
	public static void main(String[] args)
	{
		int array[]= {55,99,77,22,55,0};
		int max1=-Integer.MIN_VALUE;
		int max2=-Integer.MAX_VALUE;
		//for 1st maximum number
		for(int i=0;i<array.length;i++)
		{
			if(max1<array[i])
			{
				max1=array[i];
			}
			
		}
		
		//for 2nd maximum number
				for(int i=0;i<array.length;i++)
				{
					if(max2<array[i] && max2!=max1)
					{
						max2=array[i];
					}
					
				}
		
		
		
		
		
		
		System.out.println("The maximum number from array is : "+max1);
		System.out.println("The 2nd maximum number from array is : "+max2);

		
	}

}
