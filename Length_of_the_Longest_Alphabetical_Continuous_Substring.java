class Solution {
public int longestContinuousSubstring(String s) {
        int count  = 1;
        int maxCount = 1;

        for (int i = 1; i < s.length(); i++) {
		//cheking alphabetical continuous substring
            if (s.charAt(i-1)+1 != s.charAt(i)){
			//cheking length of substring
                if (count>maxCount)
                    maxCount = count;
                count = 1;
            }
            else 
                count++;
            //return if maxcount greater than 26 or remaining length
            if (maxCount> s.length()-i || maxCount==26)
                return maxCount;
        }
        //return max length of substring
        return Math.max(maxCount, count);
    }
}
