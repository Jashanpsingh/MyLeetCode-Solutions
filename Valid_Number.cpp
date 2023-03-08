class Solution {
public:
       bool isNumber(string s) {
    bool digit=false,e=false,dot=false;
    int sign=0;//for count  sign
    int n=s.size()-1;
    for(int i=0;i<=n;i++){
        char ch=s[i];
            // digit
        if(ch>='0'&&ch<='9')
                digit =true;
            // sign
        else if(ch=='+'||ch=='-'){
             if(sign>1)return false;
             else if(i>0&&s[i-1]!='e'&&s[i-1]!='E')return false;
             else if(i==n)return false;
                sign++;
                }
            //  dot
        else if(ch=='.'){
             if(e||dot)return false;
             else if(i==n&&!digit)return false;  
                dot=true;
            }
            //E or e
        else if(ch=='e'||ch=='E'){
             if(e||!digit||i==n)return false;
                e=true;
            }
        else{//if element is other than all i.e='a'
                return false;
            } 
        }    
    return true;
}
};
