class Solution {
    public String addStrings(String num1, String num2) {
        String ans = "";

        int n = Math.min(num1.length(), num2.length());
        int rem = 0;

        for(int i=0; i<n; i++){
            int a = num1.charAt(num1.length()-1-i)-'0';
            int b = num2.charAt(num2.length()-1-i)-'0';

            int sum = a+b+rem;
            rem = sum/10;
            sum %= 10;

            ans = sum+ans;
        }
        if(num1.length()>n){
            for(int i=n; i<num1.length(); i++){
                int a = num1.charAt(num1.length()-1-i)-'0';

                int sum = a+rem;
                rem = sum/10;
                sum %= 10;

                ans = sum+ans;
            }
        }
        else if(num2.length()>n){
            for(int i=n; i<num2.length(); i++){
                int b = num2.charAt(num2.length()-1-i)-'0';

                int sum = b+rem;
                rem = sum/10;
                sum %= 10;

                ans = sum+ans;
            }
        }

        if(rem!=0) ans = '1'+ans;

        return ans;
    }
}
