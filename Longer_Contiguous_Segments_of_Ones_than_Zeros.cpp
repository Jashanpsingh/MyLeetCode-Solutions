class Solution {
public:
    bool checkZeroOnes(string s) {
        int oneMax = 0;
        int zeroMax = 0;
        int oneStreak = 0;
        int zeroStreak = 0;

        for(char n : s){
            if(n == '1'){
                zeroStreak = 0;
                oneStreak++;
                oneMax = max(oneStreak, oneMax);
            }
            else{
                oneStreak = 0;
                zeroStreak++;
                zeroMax = max(zeroStreak, zeroMax);
            }
        }

       return oneMax > zeroMax; 
    }
};
