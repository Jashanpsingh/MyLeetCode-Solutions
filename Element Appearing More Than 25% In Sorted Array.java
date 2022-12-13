class Solution {
    public int findSpecialInteger(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
            }
            int size = arr.length;
            int oneForth = size/4;
            for (int i = 1; i < size - oneForth; i++) {
                if((i + oneForth < size) && arr[i + oneForth] == arr[i]) {
                    return arr[i];}
                    }
                    return -1;
                    }
                    }
