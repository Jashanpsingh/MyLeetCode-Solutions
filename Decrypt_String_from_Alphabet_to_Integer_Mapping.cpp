class Solution {
public:
    string freqAlphabets(string s) {
        string res;
        for(int i=0;i<s.size();i++){
            if(i+2 < s.length() && s[i+2] == '#'){
                res+=stoi(s.substr(i, 2))+96;
                 i+=2;
            }else res+=s[i]+48; 
        }
       return res; 
    }
};
