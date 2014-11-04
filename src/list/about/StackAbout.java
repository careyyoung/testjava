package list.about;

import java.util.Stack;

public class StackAbout {

	public static void main(String[] args) {
		String str1 = new String(
				"+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---");

		Stack<Character> sta1 = new Stack<Character>();
		for (int i = 0; i < str1.length(); i++) {
			if ('+' == str1.charAt(i)) {
				sta1.push(str1.charAt(i + 1));
			} else if ('-' == str1.charAt(i)) {
				System.out.print(sta1.pop());
			}
		}
	}

}
