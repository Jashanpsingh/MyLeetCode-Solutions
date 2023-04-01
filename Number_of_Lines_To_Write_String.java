class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines=1;
        int width=0;
        
        for(char ch:s.toCharArray()){
            int value=widths[ch-'a'];
            width+=value;
            if(width>100){
                lines++;
                width=value;
            }
        }
      
        return new int[]{lines,width};
    }
}
