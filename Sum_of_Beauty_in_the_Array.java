class Solution {
    public int sumOfBeauties(int[] nums) {
        int maxTillNow = 0;
        int total = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=1; i<= nums.length-2; i++) {
            if(nums[i-1] < nums[i] && nums[i]<nums[i+1]) {
                total++;
                if(nums[i-1]>=maxTillNow) {
                    stack.push(nums[i+1]);
                }
                maxTillNow = Math.max(maxTillNow, nums[i-1]);
            } else {
                maxTillNow = Math.max(maxTillNow, nums[i-1]);
                while(!stack.isEmpty() && nums[i+1] < stack.peek()) {
                    stack.pop();
                }
            } 
        }
        while(!stack.isEmpty()){
            stack.pop();
            total++;
        }
        return total;
    }
}
