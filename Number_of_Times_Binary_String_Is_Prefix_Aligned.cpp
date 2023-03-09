class Solution {
public:
    int numTimesAllBlue(vector<int>& l) {
        int n = l.size();
        vector<int> num(n , 0);
        for(int i = 0 ; i < n ; i++){
            num[l[i]-1] = i+1;
        }
        int day =1; 
        int moments = 0;
        for(int i = 0 ; i < n ; i++){
            day = max(day , num[i]);
            if(i+1 == day)moments++;
        }
        return moments;
    }
};
