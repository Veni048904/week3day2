package Week3day2;

public class Findtype {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "#123 He is a Doctor";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] textchar = test.toCharArray();
		for (int i = 0;i<textchar.length;i++) {
			if(Character.isLetter( textchar[i])) {
				letter++;
			}
			else if(Character.isDigit(textchar[i])) {
				num++;
			}
			else if(Character.isSpaceChar(textchar[i])) {
				space++;
			}
			else {
				specialChar++;
			}

		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
		
	}

}

