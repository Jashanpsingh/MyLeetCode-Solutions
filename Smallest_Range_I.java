class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int smallest = Integer.MAX_VALUE;
        int min = nums[0];
        int max = nums[nums.length - 1];         
        smallest = Math.min(smallest, (max - k) - (min + k));
        return smallest <= 0 ? 0 : smallest;
    }
}
