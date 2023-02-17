class Solution {
public:
    int maxAscendingSum(vector<int>& nums) {
        int max=INT_MIN;
        int sum=nums[0];
        
        for(int i=1;i<nums.size();i++)
        {
            if(nums[i]>nums[i-1])
                sum=sum+nums[i];
            else
            {
                if(sum>max)
                    max=sum;
                
                sum=nums[i];
            }
        }
        if(sum>max)
          max=sum;
        return max;
    }
};
