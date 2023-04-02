class Solution {
public:
    vector<int> numberOfLines(vector<int>& widths, string s) 
    {
        int line = 1, currentLine = 0;
        
        for(int i=0; i<s.length(); i++)
        {
            if(currentLine + widths[s[i]-'a'] > 100)
            {
                line++;
                currentLine = widths[s[i]-'a'];
            }
            else
                currentLine += widths[s[i]-'a'];
        }
        
        vector<int> res;
        
        res.push_back(line);
        res.push_back(currentLine);
        
        return res;
    }
};
