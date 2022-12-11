class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;

        if (n < 2) {
            return 0;
        }

        int sum = nums[0];
        int min = nums[0];


        for (int i = 1; i < n; i++) {
            min = Math.min(min, nums[i]);
            
            sum += nums[i];
        }   


        return sum - n * min;
    }
}
