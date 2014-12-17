
public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
		
		int haystackLength = haystack.length();
		int needleLength = needle.length();
		if(haystack == null || needle == null ) return -1;
		//if(needleLength==0) return 0;
		
		int index=-1; int i=0; int j=0;
		for(i=0; i <= (haystackLength - needleLength); i++) {
			for(j=0; j < needleLength; j++) {
				if(needle.charAt(j) != haystack.charAt(i+j)) {
					break;
				}
			}
			if(j == needleLength) {
				index = i;
				break;
			}			
		}
		
		return index;
        
    }

}

class Test {
	public static void main(String[] args) {
		ImplementstrStr test = new ImplementstrStr();
		String haystack = "a";
		String needle = "a";
		int result = test.strStr(haystack, needle);
		System.out.println(result);
	}
}

// haystack needle
//"abcdef" "bcd"
//"" ""
//"a" "a"
