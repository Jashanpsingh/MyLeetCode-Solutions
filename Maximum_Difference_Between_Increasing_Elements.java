class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        int min = nums[0];
        for(int i = 1 ; i < nums.length;i++){
            if(nums[i] > min){ // calculate maxDiff
                maxDiff = Math.max(maxDiff,nums[i] - min);
            }else{
                min = nums[i]; // update min as this can contribute to max diff i+1.. n
            }
        }
        return maxDiff;
    }
}
