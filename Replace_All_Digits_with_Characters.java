class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				sb.append(s.charAt(i - 1)); // Append current character.
				sb.append((char) (s.charAt(i - 1) + Integer.parseInt(String.valueOf(s.charAt(i))))); //Find the next nth character from the current character.
			}
		}
		if (!Character.isDigit(s.charAt(s.length() - 1)))
			sb.append(s.charAt(s.length() - 1)); // Append the last character if it has no digit next to it.
		return sb.toString();   
    }
}
