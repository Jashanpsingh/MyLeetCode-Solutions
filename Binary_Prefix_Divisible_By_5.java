class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int sum = 0;
        int length = nums.length;
        List<Boolean> result = new ArrayList<>();
        //Go through the nums notice that shifting a binary number to the left is equals to multiplying a decimal number by 2
        for (int i=0; i<length; i++) {
            sum = sum*2 + nums[i];
            if (sum%5==0) {
                result.add(true);
            }
            else {
                result.add(false);
            }
            //This is to prevent it from overflow
            sum = sum%5;
        }
        return result;
    }
}
