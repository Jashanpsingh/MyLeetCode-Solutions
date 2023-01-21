class Solution {
    /*
    observe: [1,3,5] -> when n = 3
    when we decrease some element then it will increase any other element
    [1,3,5] -> [2,3,4] -> [3,3,3]

    observe: [1,3,5,7] -> when n = 4
    [1,3,5,7] -> [2,3,5,6] -> [3,3,5,5] -> [4,3,5,4] -> [4,4,4,4](means if n=k then [k,k,k...,n times])
    so answer would be simply derived from [1,3,5,7] -> 4-1 + 4-3 = > 3+1 = 4(output)
    */
    public int minOperations(int n) {
        int cnt = 0;
        for(int i=0;i<n/2;i++){
            int num = (2*i)+1; 
            cnt+=n-num;
        }   
        return cnt;
    }
}
