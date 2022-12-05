    public class Solution {
    public boolean isValid(String s) {
        int len = s.length();
		char[] stack = new char[len + 1];
		int top = 1;
		for (int i = 0; i < len; ++i) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{')
				stack[top++] = c;
			else if (c == ')' && stack[top - 1] != '(')
				return false;
			else if (c == ']' && stack[top - 1] != '[')
				return false;
			else if (c == '}' && stack[top - 1] != '{')
				return false;
			else
				--top;
		}
		if (top == 1)
			return true;
		return false;
    }
}
