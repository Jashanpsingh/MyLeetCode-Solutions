class Solution {
    public int maxPower(String s) {
        char maxChar;
        int max = 0;
        char curChar = s.charAt(0);
        int cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == curChar) {
                cur++;
            } else {
                if (cur > max) {
                    maxChar = curChar;
                    max = cur;
                }
                curChar = s.charAt(i);
                cur = 1;
            }
        }
        return Math.max(max, cur);
    }
}
