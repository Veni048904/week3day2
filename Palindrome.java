package Week3day2;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strvar = "Veni";
		int strlnt = strvar.length();
		String reverse="";
		System.out.println("strvar: "+strvar);

		for(int i = strlnt-1;i>=0;i--) {
			reverse=Character.toString(strvar.charAt(i));
			System.out.println(reverse);
			
		}
		if(strvar.equals(reverse)) {
			System.out.println("Is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}


}
