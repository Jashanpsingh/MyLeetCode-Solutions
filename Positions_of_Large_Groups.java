class Solution {
public:
    vector<vector<int>> largeGroupPositions(string s) 
    {
        vector<vector<int>>res;
        int count=1;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]==s[i+1]) count++;
            else
            {
                if(count>=3) res.push_back({i-count+1,i});
                count=1;
            }
        }
        if(count>=3)
        {
            int i=s.size()-1;
            res.push_back({i-count+1,i});
        }
        return res;
    }
};
