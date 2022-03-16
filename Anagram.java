package Week3day2;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops"; 
		String text2 = "posts"; 
		   boolean status = true; 
		if (text1.length() != text2.length()) { 
			status = false;  
		}
		else {
			
			char[] ArrayText1=text1.toCharArray();
			char[] ArrayText2=text2.toCharArray(); 
			
			Arrays.sort(ArrayText1);
            Arrays.sort(ArrayText2);  
            
            status = Arrays.equals(ArrayText1, ArrayText2);  
            }  
        if (status) {  
            System.out.println(text1 + " and " + text2 + " as a anagrams");  
        } 
        else {  
            System.out.println(text1 + " and " + text2 + "  not anagrams");  
        }

	}

}
