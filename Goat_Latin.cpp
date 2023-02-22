class Solution {
public:
    string toGoatLatin(string s) {
        string ans =""; int count =0;
        for(int i=0;i<s.length();i++){
            string word;
            count++;
            while(i<s.length()&&s[i]!= ' ') 
                word.push_back(s[i++]);
            char c = tolower(word[0]); //making to lower case
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                ans += word + "ma"; //anything starting with vowel needs "ma"appended. condition 1
            else 
                ans += word.substr(1,word.length()) + word[0] + "ma"; 
            //from position 1 to length take then add the first alphabet(0th index), which
            //is a consonant then add "ma" condition2
        for(int j = 0; j < count; j++) 
            ans += "a"; //condition 3
        if(i < s.length()) 
            ans += " ";
            
        }
        return ans;
        
    }
};
