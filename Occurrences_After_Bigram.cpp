#include<iostream>
class Solution {
public:
    vector<string> findOcurrences(string text, string first, string second) {
        vector <string> s,s1;
        text=text+" ";
        string h;
        int d=0;
        for(int i=0;i<text.length();i++){
           if(text[i]==32){
            
            h= text.substr(d,(i-d));
               d=i+1;
          
           s1.push_back(h);
           }
          
           }
            for(int j=0;j<s1.size()-2;j++)
       {
           if(s1[j]==first && s1[j+1]==second)
               s.push_back(s1[j+2]);
       }
        
        return s;
    }
};
