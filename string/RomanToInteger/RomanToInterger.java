import java.util.HashMap;
import java.util.Map;

//从个位数开始计算，使用罗马数字转换成阿拉伯数字的规则
public class RomanToInterger {
	public int romanToInt(String s) {
		Map<Character, Integer> romanAndInt = new HashMap<Character,Integer>();
		romanAndInt.put('I',1);
		romanAndInt.put('V',5);
		romanAndInt.put('X',10);
		romanAndInt.put('L',50);
		romanAndInt.put('C',100);
		romanAndInt.put('D',500);
		romanAndInt.put('M',1000);
		
		int length= s.length();
		int sum=romanAndInt.get(s.charAt(length-1));
		for(int i= length-1;i>0;i--) {
			char temp1 = s.charAt(i);
			char temp2 = s.charAt(i-1);
			int intTemp1 = romanAndInt.get(temp1);
			int intTemp2 = romanAndInt.get(temp2);
	//		System.out.println("intTemp1 is "+intTemp1+"intTemp2 is "+intTemp2);
			if(intTemp1 > intTemp2) {
				sum = sum - intTemp2;				
			} else {
				sum = sum + intTemp2;
			}			
		}
		return sum;      
    }
}

class Test {
	public static void main(String[] args) {
		RomanToInterger test = new RomanToInterger();
		String s = "IV";
		int result = test.romanToInt(s);
		System.out.println(result);
	}
}

//III
