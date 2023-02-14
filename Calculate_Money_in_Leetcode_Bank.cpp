class Solution {
public:
    int totalMoney(int n)
{
    int count = 0;
    int sum = 0;
    int q = n/7;
    
    
    int start = 1, end = 7;
    while(q!=-1){
        
        for(int i=start; i<=end && count < n; i++){
            count++;
            cout << count << " ";
            sum = sum + i;
            
        }
        
        start++;
        end++;
        q--;
    }

    return sum;
}
};
