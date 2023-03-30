class Solution {
public:
    vector<string> cellsInRange(string s) {
        vector<string > jashan;
        for(int i = s[0]; i<=s[3]; i++){
            for(int j=s[1]; j<=s[4]; j++){
                string tem;
                tem+=i;
                tem+=j;
                jashan.push_back(tem);
            }
        }
        return jashan;
    }
};
