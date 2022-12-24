class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int cur = nums[0];
        int sum = nums[0];
        int n = nums.length;
        
        for(int i = 1; i<n; i++) {
            
            if( nums[i-1] < nums[i]  )
                cur += nums[i];
            else {
                cur = nums[i];
            }
            
            sum = Math.max(sum, cur);
                            
        }
        
        return sum;        
    }
}
