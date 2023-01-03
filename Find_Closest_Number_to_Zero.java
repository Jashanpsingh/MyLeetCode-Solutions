class Solution {
    public int findClosestNumber(int[] nums) {
       int smallestDis = nums[0];
        
            for (int j = 1; j < nums.length; j++) {

                if (Math.abs(smallestDis) == (nums[j])){
                    smallestDis = nums[j];
                }
                if(Math.abs(nums[j]) < Math.abs(smallestDis)){
                    smallestDis = nums[j];
                }
            }
        return smallestDis;
    }
}
