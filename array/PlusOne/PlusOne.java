
public class PlusOne {
	public int[] plusOne(int[] digits) {
		if(digits == null || digits.length == 0) return digits;
		int carry = 1;
		for(int i= digits.length-1; i>=0;i--) {
			int digit = (digits[i] + carry) %10;
			carry = (digits[i] + carry) /10;
			digits[i] = digit;
			if(carry == 0) 
				return digits;
		}
		
		int [] ret = new int[digits.length+1];
		ret[0] = 1;
		return ret;
    }
}

class est {
	public static void main(String[] args) {
		PlusOne test = new PlusOne();
		int[] digits = {9,9,9,9};
		int[] result = test.plusOne(digits);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}		
	}
}
