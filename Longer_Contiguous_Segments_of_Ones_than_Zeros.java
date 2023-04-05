class Solution {
    public boolean checkZeroOnes(String s) {
        int ones = 0, zeroes = 0, consecOnes = 0, consecZeroes = 0;
        for (char c: s.toCharArray()) {
            if (c == '1') {
                consecOnes++;
                consecZeroes = 0;
                ones = Math.max(ones, consecOnes);
            } else {
                consecZeroes++;
                consecOnes = 0;
                zeroes = Math.max(zeroes, consecZeroes);
            }
        }
        return ones > zeroes;
    }
}
