class Solution {
public:
    vector<bool> prefixesDivBy5(vector<int>& nums) {\
    
    vector<bool> res;
    int num=0;
    
    //loop over the whole array numbers
    for(int i=0;i<nums.size();i++){
        num=(num*2+nums[i])%5;
        res.push_back(num==0);
    }
    //return the new boolean values array
    return res;
    }
};
