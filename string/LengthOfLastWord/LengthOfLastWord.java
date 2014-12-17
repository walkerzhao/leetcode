
public class LengthOfLastWord {
	
	public int lengthOfLastWord(String s) {
		s = s.trim();
		int length = s.length();
		if(s == null || length==0) return 0;
		
		if(!Character.isLetter(s.charAt(length-1))) return 0;
		int count=0;
		for(int i= length-1; i>=0; i--) {
			if(Character.isLetter(s.charAt(i))) {
				count++;
			} else
				break;
		}
		return count;
    }

}

class Test {
	public static void main(String [] args) {
		LengthOfLastWord test = new LengthOfLastWord();
		String s = "a ";
		int count = test.lengthOfLastWord(s);
		System.out.println(count);
	}
}


//"hello world";
//""
//"a "