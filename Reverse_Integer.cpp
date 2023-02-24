class Solution {
public:
    int reverse(int n) {
        
        long reverse=0;  
        
        while(n!=0)
        {
            int temp = n%10;
            reverse = reverse*10+temp;
            if(reverse>=INT_MAX || reverse<=INT_MIN) //checkint if the reverse value is following the INT_MAX or INT_MIN condition or not
			{ 
                return 0;
            }
            n/=10;
        }
        
        int ans=reverse;
        return ans;
    }
};
