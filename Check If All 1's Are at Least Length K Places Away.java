class Solution {
public boolean kLengthApart(int[] nums, int k) {

    int one=-1;
    boolean b=true;
    
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==1)
        {
           if(one==-1)
              one=i;
            
            else
            {
               if(!((i-one-1)>=k))
                 {b=false;
                    break; }
                
                   one=i;
            }
        }
    }
   return b; 
}
}
