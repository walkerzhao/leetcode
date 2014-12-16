public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int length = s.length();
		s = s.toLowerCase();
		if(s.equals("") || length == 0)
			return true;
	
		int i=0, j=length-1;
		while(i<j) {												
			char c = s.charAt(i);
			char d = s.charAt(j);
			while(!Character.isDigit(c) && !Character.isLetter(c)) {
				i++;
				c = s.charAt(i);
				if(i>=j)
					return true;
			}
			
			while((!Character.isDigit(d)) && (!Character.isLetter(d))) {
				j--;
				d = s.charAt(j);
				if(i>=j) 
					return true;
			}				
			if(c != d) 
				return false;
			i++;
			j--;									
		}
		return true;
        
    }
}
