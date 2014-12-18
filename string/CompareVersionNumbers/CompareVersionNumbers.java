
public class CompareVersionNumbers {
	
	public int compareVersion(String version1, String version2) {
		int length1 = version1.length();
		int length2 = version2.length();
		int i=0; int j=0;
		int result1=0; int result2=0;
		while(true) {
			while(i < length1 && version1.charAt(i) != '.') {				
				result1 = result1*10+(version1.charAt(i)-'0');
				i++;
			}
			while(j < length2 && version2.charAt(j) != '.') {			
				result2 = result2*10 + (version2.charAt(j)-'0');
				j++;
			}
			//System.out.println("result1 is " +result1+" result2 is " + result2);
			
			if(result1 > result2) 
				return 1;
			else if(result1 < result2) 
				return -1;
			else {
				result1 = result2 = 0;	
				i++;j++;
			}
			if(i>length1-1 && j > length2-1) 
				return 0;			
		}
       
    }
}

class Test {
	public static void main(String [] args) {
		CompareVersionNumbers test = new CompareVersionNumbers();
		String version1 = "1.2.3.4";
		String version2 = "1.2.3.3";
		int result = test.compareVersion(version1, version2);
		System.out.println(result);
	}
	
}

//Test
// "1.2.3.4" "1.2.3.3"
