class Solution {
    public int numTimesAllBlue(int[] flips) {
        long sum=0;
        long expected=0;
        int j=1;
        int count=0;
        for (int i:flips)
        {
            sum+=i;
            expected+=j++;
            if(sum==expected){count++;}
        }
        return count;
    }
}
