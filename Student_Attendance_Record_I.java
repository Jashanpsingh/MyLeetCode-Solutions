class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            if(a==2) return false;
            if(l==3) return false;
            if(s.charAt(i)=='A') a++;
            if(s.charAt(i)=='L')l++;
            else l=0;
            }
            if(a>=2) return false;
            if(l>=3) return false;
            return true;
            }
    }
