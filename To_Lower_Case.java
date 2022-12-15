class Solution {
    public String toLowerCase(String str) {
        char c[]=new char[str.length()];
        int i=0;

        for(char ch : str.toCharArray()){
            c[i++]=Character.toLowerCase(ch);
            }
            String s = new String(c);
            
            return s;
    }
}
