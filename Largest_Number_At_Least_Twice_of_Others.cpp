class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int maxi =-1; // finding the max element;;
        for(int i=0;i<nums.size(); i++)
        {
            maxi= max(maxi, nums[i]);
        }
        int ans =-1;
        for(int i=0; i<nums.size(); i++)
        {
            if(maxi != nums[i]  &&   nums[i] * 2 > maxi) return -1;
            if(maxi == nums[i])
            {
                ans = i;
            }
        }
        return ans;

    }
};
