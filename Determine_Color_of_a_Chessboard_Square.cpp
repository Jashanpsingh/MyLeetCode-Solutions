class Solution {
public:
    bool squareIsWhite(string coordinates) {
        
        int num1=coordinates[0];
        int num2=coordinates[1];

        if (num1%2==0&&num2%2==0 || num1%2==1&&num2%2==1){
            return false;
        }

    else 
    return true;
    }
};
