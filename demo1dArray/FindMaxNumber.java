package demo1dArray;

public class FindMaxNumber {
	public static void main(String[] args)
	{
		int array[]= {45,1,2,3,4,88,9};
		int max=array[0];
		
		//find the max number form array 
		for(int i=1;i<array.length;i++)
		{
			if(max<array[i])
			{
				max=array[i];
			}
		}
		System.out.println("The maximum number of array is : "+max);
		
	}

}
