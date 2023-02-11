class Solution {
public:
    bool detectCapitalUse(string word) {
        if(word.size()==1){
            return true;
        }
        if(word[0]>=97 || word[0]<95 && word[1]>=95){
            for(int i=1; i<word.size(); i++){
                if(word[i]<97){
                    return false;
                }
            }
        }else if(word[0]<95 ){
            for(int i=1; i<word.size(); i++){
                if(word[i]>90){
                    return false;
                }
            }
        }
        return true;

    }
};
