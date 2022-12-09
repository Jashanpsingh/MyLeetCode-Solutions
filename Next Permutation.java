class Solution {
public void nextPermutation(int[] nums) {

    int numL = nums.length;
    int intS=-1;
    for(int i=numL-1; i>0; i--){
        if(nums[i]>nums[i-1]){
            intS = i-1;
            break;
        }
    }

    if(intS>=0){
        for(int i=numL-1; i>=intS; i--){
            if(nums[i]>nums[intS]){
                swap(nums, i, intS);
                break;
            }
        }
       reverse(nums, intS+1); 
       return;
    }
    reverse(nums, 0);  
}

public void swap(int[] nums, int i1, int i2){
    int temp = nums[i1];
    nums[i1] = nums[i2];
    nums[i2] = temp;
}

public void reverse(int[] nums, int j1){
    for(int i=nums.length-1; i>j1; i--){
        int temp=nums[i];
        nums[i]=nums[j1];
        nums[j1]=temp;
        j1++;
        
    }
}
}
