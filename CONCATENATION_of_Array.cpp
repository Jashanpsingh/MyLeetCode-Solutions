class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> ans;
        int n=nums.size();
        for(int i=0;i<2*n;i++){
            int k=i;
            if(i>=n){
                k=i-n;
            }
            ans.push_back(nums[k]);
        }
        return ans;
    }
};
1
1

