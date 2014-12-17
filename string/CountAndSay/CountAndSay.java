//初始输入是１，通过循环，返回第n次得到的字符串
//比如１－１，２－11,3-21,4-1211,5-111221
public class CountAndSay {
	public String countAndSay(int n) {
		String str="1";
		String result = "";
		int length = str.length();
		int count = 1; int i=1;
		for(int j=2; j <= n; j++) {
			for(i=1; i<length; i++) {
				if(str.charAt(i-1) == str.charAt(i)) {
					count = count+1;				
				} else {
					result = result + count + str.charAt(i-1);
					count = 1;
				}
			}
			result = result + count + str.charAt(length-1);			
			str = result;
			length = str.length();
			result = "";
			count =1 ;
		}
		return str;
    }

}

class Test {
	public static void main(String [] args) {
		int n =5;
		CountAndSay test = new CountAndSay();
		String result = test.countAndSay(n);
		System.out.println(result);
	}
}
//1
