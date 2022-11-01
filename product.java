package DataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class product {

	public static void product(int []array)
	{
		int []left=new int[array.length];
		int leftProduct=1;
		int rightProduct=1;
		int leftIndex=0;
		int rightIndex=0;
		int []right=new int[array.length];
		int [] result=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			leftProduct=leftProduct*array[i];
			left[leftIndex++]=leftProduct;
		}
		
		for(int i=array.length-1;i>=0;i--)
		{
			rightProduct=rightProduct*array[i];
			right[i]=rightProduct;
		}
		
		result[0]=right[1];
		result[array.length-1]=left[array.length-2];
		
		for(int i=1;i<array.length-1;i++)
		{
			result[i]=left[i-1]*right[i+1];
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		int []array= {1,2,3,4};
		product(array);
		

	}

}
