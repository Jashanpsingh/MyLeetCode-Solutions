class Solution {
    public int maximumValue(String[] strs) {
        int M = 0;
        
        for(int i = 0; i < strs.length; i++) {
            try {
                int m = Integer.parseInt(strs[i]);
                M = Math.max(m, M);
            }
            catch (NumberFormatException e) {
                int max = strs[i].length();
                M = Math.max(max, M);
            }
        }
        
        return M;
    }
}
