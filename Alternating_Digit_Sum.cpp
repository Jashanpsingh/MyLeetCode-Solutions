class Solution {
public:
    int alternateDigitSum(int n) {
        int sum=0;
        string s=to_string(n);
        int len=s.size();
        for(int i=0;i<len;i++)
        {
            if(i%2==0)
            {
                sum+=s[i]-'0';
            }
            else
            {
                sum-=s[i]-'0';
            }
        }
        return sum;
    }
};
