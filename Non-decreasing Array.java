class Solution {
    public boolean checkPossibility(int[] nums) {
        if (nums.length == 1) return true;
        
        int count = 0;
        for (int i = 1; i < nums.length && count < 2; i++) {
            if (nums[i] >= nums[i - 1]) {
                continue; // non-decrease
            }
            
            if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1]; // corner case
            } else {
                nums[i - 1] = nums[i]; // set them equal, wont affect future height
            }
            count++; 
        }
        return count < 2; // if modify more than once
    }
}
