import javax.sound.sampled.ReverbType;


public class AddBinary {
	
	public String addBinary(String a, String b) {
		int length1 = a.length();
		int length2 = b.length();
		int i = length1-1; int j = length2-1;
		String result="";
		int sum=0;
		int jinwei=0;
		
		while(true) {
			if(i>=0 && j>=0) {
				sum = (a.charAt(i)-'0') + (b.charAt(j)-'0')+jinwei;
				i--; j--;
			} else if(i>=0 && j<0) {
				sum = (a.charAt(i)-'0') + jinwei;
				i--;
			} else if(i<0 && j>=0) {
				sum = (b.charAt(j)-'0') + jinwei;
				j--;
			} else if( i < 0 && j < 0) {
				result = (jinwei == 0)?result:(result+jinwei);
//				result = result + jinwei;
				int size = result.length();
				String s="";
				for(int k=size-1; k>=0; k--) {
					s = s + result.charAt(k);
				}
				return s;
			}
			
			if(sum == 0 || sum == 1)  {
				jinwei=0;				
			} else if(sum == 2 ) {
				jinwei = 1;
				sum = 0;
			} else if(sum == 3) {
				jinwei = 1;
				sum =1;
			}
			result = result + sum;
		}       
    }
}

class Test {
	public static void main(String [] args) {
		AddBinary test = new AddBinary();
		String a = "1"; String b = "0";
		String result = test.addBinary(a, b);
		System.out.println(result);
	}
}


//Test
//"11" ,"1"
//"11","11"
//"0","0"