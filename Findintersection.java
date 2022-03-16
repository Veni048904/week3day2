package Week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Findintersection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] array1 = {8,9,12,7,6,5};
		Integer[] array2 = {5,7,8,11,3,4};
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		Collections.addAll(list1, array1);
		Collections.addAll(list2, array2);
		
		String resultint = "";

		for(int i = 0;i<list1.size();i++) 
		{
			for(int j = 0;j<list2.size();j++) 
			{
				if(list1.get(i) == list2.get(j) ) 
				{
					if(resultint.isEmpty()) 
					{
						resultint += list1.get(i).toString();
					} 
					else {
						resultint += ","+ list1.get(i).toString();
				}

			}
		}
	}
		System.out.println("Print Intersection value :" +resultint);

		
	}

}
