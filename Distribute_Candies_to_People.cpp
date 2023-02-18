class Solution {
public:
    vector<int> distributeCandies(int candies, int num_people) {
    vector<int> ans(num_people,0);
    int count=1;
    for(int i=0;i<=num_people && candies>0;i++){
        if(i==num_people){
            i=0;
        }
        int v=min(count,candies);
        ans[i]+=v;
        count++;
        candies-=v;
    }
    return ans;
    }
};
