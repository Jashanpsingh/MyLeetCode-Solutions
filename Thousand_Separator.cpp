class Solution {
public:
    string thousandSeparator(int n) {
        string x = to_string(n);
        cout<<x<<endl;
        int count = 3;
        string ans;

        
        for(int i = x.size()-1 ; i>=0 ; i--){
            // cout<<x[i]<<" ";
            if(count == 0){
                ans += '.';
                count = 3;
            }

            count--;
            
            ans += x[i];
        
        }
        reverse(ans.begin(),ans.end());
        
        return ans;
    }
};
