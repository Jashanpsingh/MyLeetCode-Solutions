class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int sign=1;

        // converting the input integer to string

        String s=Integer.toString(n);

        for(int i=0;i<s.length();i++){
            int v=s.charAt(i)-'0';
            sum+=(v*sign);
            sign=sign*-1;
        }
        return sum;
    }
}
