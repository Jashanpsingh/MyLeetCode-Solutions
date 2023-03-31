class Solution {
public:
    int getMinDistance(vector<int>& nums, int target, int start) {
        int ans=INT_MAX;
        for(int i=0;i<nums.size();i++){
            if(nums[i]== target){
                int k=abs(i-start);
                if(ans>k){
                ans = k;
                }    
            }
        }
        return ans;
    }
};
