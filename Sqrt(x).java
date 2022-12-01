class Solution {
    public int mySqrt(int x) {
    if (x <= 1) return x;
    int l = 1, r = x;
    while (l < r) {
        int m = l+(r-l)/2;
        if (m*m/m != m || m*m > x) r = m;
        else l = m+1;
    }
    return r-1;
}
}
