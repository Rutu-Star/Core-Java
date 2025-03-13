package demo1dArray;

public class FindMinimumNumber {
	public static void main(String[] args)
	{
		int array[]= {99,55,10,85,99,2,78,45,22};
		int min=array[0];
		
		//find the minimum number form array 
		for(int i=1;i<array.length;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
		}
		System.out.println("The maximum number of array is : "+min);
		
	}

}
