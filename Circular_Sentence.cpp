class Solution{
    public:
    bool isCircularSentence(string s){
        int n=s.size();
        for(int i=0; i<n-1; i++)
            if(s[i+1]==' ' && s[i]!=s[i+2])
            
                return false;
        
        return s[0]==s[n-1];
    }
};
