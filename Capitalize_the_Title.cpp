class Solution {
public:
    string capitalizeTitle(string title) {
        string Capitalize = ""; 
        int len = title.length() , j = 0;
    
        string word = ""; // For storing words of input string 

        for(int i=0;i<len;i++){
            // if we get space it means that we have to capitalize the word 
            // if the length of word is one or two do not need to capitalize the word so we just  add to the output string otherwise make the first letter capital and it to the output string
            if(title[i]==' '){
                if(word.length()>2) word[0] -= 32;
                word += ' ';
                Capitalize += word;
                word.erase(); // deleting the word for storing new word
            }
            else{
                if(title[i] >= 'A' && title[i]<='Z') word += title[i] + 32;
                else word += title[i];
            }
        }

        // in the last word do not get any space so we have to add the last word in output string
        if(word.length()>2){ 
            word[0] -= 32;
            Capitalize += word;
        }
        else Capitalize += word;

        return Capitalize;
    }
};
