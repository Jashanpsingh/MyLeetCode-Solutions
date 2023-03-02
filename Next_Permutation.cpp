class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int cnt=0;
        do{
            if(cnt==1){
                break;
            }
            cnt++;
        }while(next_permutation(nums.begin(), nums.end()));
    }
};
