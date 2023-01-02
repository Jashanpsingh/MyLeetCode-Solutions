class Solution {
    public boolean validMountainArray(int[] arr) {

    int i = 0, len = arr.length - 1;
    
    while(i < len && arr[i] < arr[i+1]) 
        i++;
    
    if (i == 0 || i == len) 
        return false;
    
    while (i < len) 
        if (arr[i] <= arr[i++ +1]) 
            return false;
    
    return true;
    }
}
