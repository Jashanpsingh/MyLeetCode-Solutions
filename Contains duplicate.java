class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null) {
            return false;
        }
        int len = nums.length;
        if(len == 0 || len ==1) {
            return false;
        }
        
        Arrays.sort(nums);
        int x = nums[0];
        for(int i=1; i<len; i++) {
           if(x == nums[i]) {
               return true;
           }
           x = nums[i];
        }
        return false;
    }
}
