
public class LongestCommonPrefix {
	 public String longestCommonPrefix(String[] strs) {
		 String ret="";
		 int size = strs.length;
		
		 //System.out.println("the str's size is " + size);
		 if(size == 0) return ret;
		 
		 int strs0Length = strs[0].length();
		 for(int i=0;i<strs0Length; i++) {
			 for(int j = 1; j < size; j++) {
				 int length = strs[j].length();
				 if(length-1 >= i) {
					 if(strs[0].charAt(i) != strs[j].charAt(i)) {
						 return ret;
					 }
				 } else return ret;
			 }
			 ret = ret + strs[0].charAt(i);
		 }
		 return ret;
		 
	 }

}

class Test {
	public static void main(String [] args) {
		LongestCommonPrefix test = new LongestCommonPrefix();
		String[] strs = {};
		String result = test.longestCommonPrefix(strs);
		System.out.println(result);	
	}
}

//{"abcd","abc","abcde","abcdef"};

