class Solution {
        public int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // If there is a zero in the array return 0
            if (nums[i] == 0)
                return 0;
            // Count how many negative numbers in the array
            if (nums[i] < 0) 
                count++;
        }
        // If there are even negative numbers, return 1
        if (count % 2 == 0)
            return 1;
        
        // If there are odd negative numbers, return -1
        return -1;
    }
}
