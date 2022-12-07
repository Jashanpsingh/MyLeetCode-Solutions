class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            
            //check kiya ki kya pichli value agli se badi hai 
            if(nums[i] > nums[(i + 1) % nums.length])
            
                count++;
        }
        //baar baar value badi mil rhi hai iska mtlb sorted ni hai 
        if(count > 1){
            return false;
        }
        return true;
    }
}
