class Solution {
    public boolean squareIsWhite(String coordinates) {
        int ascii = coordinates.charAt(0) - 'a';
        int val = coordinates.charAt(1) - '0';
        int total = ascii + val;
        if(total % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
