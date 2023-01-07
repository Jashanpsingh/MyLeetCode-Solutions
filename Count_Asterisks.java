class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int helper = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)== '|'){
                helper++;
            }
          if(s.charAt(i)== '*'&&helper%2==0){
              count++;
          }
        }
   return count; }
}
