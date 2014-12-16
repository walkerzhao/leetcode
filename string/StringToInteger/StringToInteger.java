/找到数的开始和结尾即可
public class StringToInteger {
	public int atoi(String str) {
		if(str == null) return 0;
		str = str.trim();
		int length=str.length();
		if(length == 0) return 0;
		
		long result=0;
		int start=0,end=0;
		int i=0;		
		int sign=1;		
		char c = str.charAt(0);
		
		if(c>'0' && c<='9') {
			start=0;
			sign=1;
		}else if(c == '-') {
			sign=-1;
			start=1;
		}else if(c == '+' || c == '0') {
			sign=1;
			start=1;
		} else
			return 0;

		for(i=start; i<=str.length()-1;i++) {
			c = str.charAt(i);			
			if(Character.isDigit(c)) {
				c = (char) (str.charAt(i)-'0');
				result = result*10+c;
				long test = sign*result;
				if(test >=2147483647 ) {
					result = 2147483647;
					break;
				} else if(test <= -2147483648) {
					result = 2147483648L;
					break;
				} 
			} else
				break;
			
		}
		return (int)(sign*result);
    }

}

class Test {
	public static void main(String[] args) {
		StringToInteger test = new StringToInteger();
		String str = "9223372036854775809";
		int result=0;
		result = test.atoi(str);
		System.out.println(result);
	}
}
//12345.67
//fjhakhfka12345.67
//fjhakhfka21474836472.67
//+-2
//" b11228552307"
//010
//"9223372036854775809"
