class Solution {
    public String convertToBase7(int num) {
        Integer res = 0;
        int i = 1;
        while(num != 0){
            res += (num % 7) * i;
            i *= 10;
            num /= 7;
        }
        return res.toString();
    }
}
