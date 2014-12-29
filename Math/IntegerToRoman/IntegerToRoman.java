import java.util.HashMap;
import java.util.Map;


public class IntegerToRoman {
	 public String intToRoman(int num) {
		 int[] arrayInteger= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		 String arrayRoman[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		 
		 String result="";
		 int length = arrayInteger.length;
		 for(int i=0;i<length;i++) {
			 while(num>=arrayInteger[i]) {
				 num = num - arrayInteger[i];
				 result = result+arrayRoman[i];
			 }
		 }
		 return result;
	 }

}

class Test {
	public static void main(String[] args) {
		IntegerToRoman test = new IntegerToRoman();
		int num = 3999;
		String result = test.intToRoman(num);
		System.out.println(result);
	}
}
//测试用例
//5
//4
//90
//3999

