package classes;

import java.util.List;
import java.util.Stack;

public class Interpreter {

	public String reverse(String input) {
		Stack<Character> reverser = new Stack<Character>();
		
		for(int i=0 ; i<input.length(); i++) {
			reverser.add(input.charAt(i));
		}
		StringBuilder reverseStr = new StringBuilder();
		while(!reverser.isEmpty()) {
			reverseStr.append(reverser.pop());
		}
		return new String(reverseStr);
	}
	
	public String toUpper(String input) {
		return input.toUpperCase();
	}	
	
}