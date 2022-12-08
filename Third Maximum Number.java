class Solution {
    public int thirdMax(int[] arr) {
    long max = Long.MIN_VALUE;
    long mid = max;
    long min = max;
    for (int i : arr) {
        if (i > max) {
            min = mid;
            mid = max;
            max = i;
        } else if (max > i && i > mid) {
            min = mid;
            mid = i;
        } else if (mid > i && i > min) {
            min = i;
        }
    }
    return (int) (min != Long.MIN_VALUE ? min : max);
}
}
