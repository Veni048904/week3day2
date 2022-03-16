package Week3day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";		

		List<String> list = new ArrayList<String>();
		Set<String> set = new LinkedHashSet<String>();
		String[] textarray = text.split(" ");
		for(String str : textarray) {
			list.add(str);
			set.add(str);
			String s="Java";
			System.out.println(s.charAt(1));
			
		}
		
		System.out.println("list:" +list);
		System.out.println("set:"+set);
		
		String correctSentence = "" ;
		for(String string : set){
			
			correctSentence += " " + string;

		} 
		
		System.out.println("correctSentence:" +correctSentence);
	}


}
