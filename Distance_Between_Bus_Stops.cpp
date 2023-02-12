class Solution {
public:
    int distanceBetweenBusStops(vector<int>& distance, int start, int destination) {
        int s1=0,s2=0;
        int beg = min(start,destination);
        int end = max(start,destination);
        for(int i=beg;i<end;i++){
            s1+=distance[i];
            distance[i]=0;
        }
        for(auto x:distance){
            s2+=x;
            if(s2>s1) return s1;
        }
        return s2;
    }
};
