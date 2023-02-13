class Solution {
public:
    int maxPower(string s) {
        int count=0;
        int Max=0;
        for(int i=0;i<s.length();i++){
            if(s[i]==s[i+1]){
                count++;
            }
            Max=max(Max,count);
            if(s[i]!=s[i+1]){
                count=0;
            }
        }
        return Max+1;
    }
};
