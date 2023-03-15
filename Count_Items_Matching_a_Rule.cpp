class Solution {
public:
    int countMatches(vector<vector<string>>& items, string r1, string r2) {
        int k;
        int count =0;
        if(r1 == "type")
            k=0;
        else if(r1 == "color")
            k=1;
        else 
            k=2;
      
        cout<<k;
        for(int i=0;i<items.size();i++){
                if(items[i][k]==r2)
                    count++;
            }
        
        return count;
    }
};
