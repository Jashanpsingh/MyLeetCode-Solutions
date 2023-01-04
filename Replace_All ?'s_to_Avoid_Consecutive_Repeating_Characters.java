class Solution {
    public String modifyString(String s) {
        if (s == null || s.isEmpty())
            return "";
        char[] str = s.toCharArray();
        for (int i=0; i<str.length; i++) {
            if (str[i] == '?') {
                for (char j='a'; j<='z'; j++) {
                    str[i] = j;
                    if (i>0 && str[i-1] == j)
                        continue;
                    if(i<str.length-1 && str[i+1] == j)
                        continue;
                    break;
                }
            }
        }
    
        return new String(str);
    }
}
