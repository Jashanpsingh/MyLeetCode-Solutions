class Solution {
public:
    string reverseStr(string s, int k) {
        int n = s.size();
        if(n<2) return s;
        for(int i=0;i<n;i+=2*k){
           if((n-i)<k){
                reverse(s.begin()+i,s.end());
           }
           else {
               reverse(s.begin()+i,s.begin()+i+k);
           }
        }
        return s;
    }
};
