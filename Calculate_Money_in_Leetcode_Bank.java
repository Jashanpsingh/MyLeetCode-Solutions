class Solution {
        public int totalMoney(int n) {
        int weeks = n / 7;
        int days_left = n % 7;
        return (28 * weeks + 7 * weeks * (weeks - 1) / 2) + (days_left * weeks + days_left * (days_left + 1) / 2);
    }
}
