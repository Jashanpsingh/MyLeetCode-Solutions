class Solution {
public:
    int countDigits(int num) {
        int count =0;
        int q=num;
        while(q!=0){
            int r=q%10;
            if(num%r==0){
                count++;
            }
            q=q/10;
        }
        return count;
        
    }
};
