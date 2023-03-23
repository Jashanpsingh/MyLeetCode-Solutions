class Solution {
public:
    vector<vector<int>> largeGroupPositions(string s) {
        vector<vector<int>> ans;
        vector<int> temp(2,0);
        int count=1;
        int in=0;
        s+='(';    // to avoid array out of bound index error
        
        for(int i=0;i<s.size();i++){
            if(s[i]==s[i+1])count++;
            else {
                if(count>=3){
                    temp[0]=in;
                    temp[1]=i;
                    ans.push_back(temp);
                }
                in=i+1;
                count=1;
            }
        }
        
        return ans;
    }
};
