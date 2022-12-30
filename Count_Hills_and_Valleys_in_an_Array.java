class Solution {
    public int countHillValley(int[] nums) {
       int count=0;
        for(int i=1;i<nums.length-1;i++){
           
            for(int j=i+1;j<nums.length;j++){
                 if(nums[i]==nums[j]){
                continue;
            }
                if(nums[i-1]<nums[i] && nums[j]<nums[i]){
                    count++;
                }else if(nums[i-1]>nums[i] && nums[j]>nums[i]){
                    count++;
                } 
                break;
            }
        }
        return count;
    }
}
