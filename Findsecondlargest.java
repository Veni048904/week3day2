package Week3day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Findsecondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {5,7,2,11,8,6,0};

		Arrays.sort(data);
		System.out.println(data[data.length-2]);
		
		Integer[] data1 = {4,3,7,0,8,1,13};
		List<Integer>list = Arrays.asList(data1);
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));
	}

}

