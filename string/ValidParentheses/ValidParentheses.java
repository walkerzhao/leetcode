import java.util.Stack;

import javax.print.attribute.standard.Chromaticity;
public class ValidParentheses {
    public boolean isValid(String s) {
        
        int length = s.length();
		Stack<Character> stack = new Stack<Character>();
		char beforeChar = '(';
		for(int i=0; i<length; i++) {
			char c = s.charAt(i);					
			if(c == '(' || c == '{' || c == '[')  {
				stack.push(c);
				continue;		
			} 			

		
			if(stack.isEmpty()) {	
				return false;
			}
			else {
				beforeChar = stack.peek();
				
				if(c == ')') {
					if(beforeChar == '(') {
						stack.pop();
						continue;
					}
					else {
						return false;
					}							
				}
				
				if(c == ']') {
					if(beforeChar == '[') {
						stack.pop();
						continue;
					}
					else {
						return false;
					}							
				}
				
				if(c == '}') {
					if(beforeChar == '{') {
						stack.pop();
						continue;
					}
					else {
						return false;
					}							
				}
			}
		}
		if(stack.isEmpty()) {
			return true;
		} else
			return false;

        
    }
}
