class Solution {
    public String removeOuterParentheses(String S) {
        String k="",s="";int c=0,d=0;// c-> to count no. of '(' and d->no. of ')' 
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='('){
            s=s+'(';
                c++;
            }
            else if(S.charAt(i)==')')
            {
                s=s+')';
                d++;
            }
            if(c==d)// when c==d means one complete bracket series ended....eg: (()()) c==d for this.... 
            {
                k=k+s.substring(1,s.length()-1);// select the string execpt first and last portion 1 -> s.length()-1,which gives ()()
                s="";//this for next bracket series
                c=d=0;//for next bracket series....
            }
        }
        return k;
    }
}
