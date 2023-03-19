class Solution {
    public int dominantIndex(int[] nums) {
            int max=0,index=-1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>max){
                    max=nums[i];
                    index=i;
                    }
                    }
                    for(int i=0;i<nums.length;i++){
                        if(i!=index && nums[i]>(max/2) ){
                            return -1;
                            }
                            }
            return index;
    }
}
