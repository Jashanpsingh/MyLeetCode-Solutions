class Solution {
public:
    string countAndSay(int n) {
        if(n==1){
            return "1";
        }
        string s = countAndSay(n-1);
        char cur = s[0];
        int c=0;
        string ans= "";
        for(int i=0;i<s.length();i++){
            if(cur == s[i]){
                c++;
            }
            else{
                ans += c+'0';
                ans += cur;
                cur= s[i];
                c=1;
            }
        }
        ans+= c+'0';
        ans += cur;
        return ans;
    }
};
