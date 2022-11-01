package DataStructure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class questionII {

	public static void main(String[] args) {
	
		HashSet<List<Integer>>set=new HashSet<>();
		
		
		int []arr= {-1,0,1,2,-1,-2};
		int len=arr.length;
		
int i=0;
while(i<len)
{
	 int j=i+1, k=j+1;
	while(j < len && k<len)
	{
		
		ArrayList<Integer> list1=new ArrayList<>();
		if(arr[i]+arr[j]+arr[k]==0)
		{
		    list1.add(arr[i]);
			list1.add(arr[j]);
			list1.add(arr[k]);
			
			set.add(list1);
		}
		
		j++;
		k++;
	}
	
	i++;
}
System.out.println(set);

	}

}

		
	

	







