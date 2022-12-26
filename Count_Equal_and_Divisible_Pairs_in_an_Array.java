class Solution {
    public int countPairs(int[] nums, int k) {
        int j=0;
        int count = 0;
        while(j<nums.length)
        {
            for(int i=j+1;i<nums.length;i++)
        {
           int no = nums[j];
            if(no == nums[i])
            {
                if((j*i)%k==0)
                {
                    count +=1;
                }
            }
            else
            {
                continue;
            }
            
        }
            j++;
        }
       return count; 
    }
}
