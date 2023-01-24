class Solution {
    public int countDigits(int num) {
        if(num >= 1 && num <= 9) return 1;
        int count = 0;
        int nums = num;
        while(num != 0){
            int rem = num % 10;
            if(nums % rem == 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
