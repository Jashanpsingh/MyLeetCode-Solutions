class Solution {
public:
    bool isThree(int n) {
        if(n<=3) return false;
        int count=1;
        for(int i=2;i<=n;i++){
            if(n%i==0) count++;
        }
        if(count==3) return true;
        return false;
    }
};
