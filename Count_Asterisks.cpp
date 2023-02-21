class Solution {
public:
    int countAsterisks(string s) {
        int ans=0;
        int p=0;
        for(char c:s){
            if(c=='|')p++;
            ans+=(p%2==0 && c=='*');
        }
        return ans;
    }
};
