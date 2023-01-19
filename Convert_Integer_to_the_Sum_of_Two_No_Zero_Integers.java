class Solution {
    public int[] getNoZeroIntegers(int n) {
	for (var i = 1; i <= n / 2; i++)
		if (noZero(i) && noZero(n - i))
			return new int[]{i, n - i};
	return null;
}

private boolean noZero(int i) {
	while (i != 0) {
		if (i % 10 == 0)
			return false;
		i /= 10;
	}
	return true;
}
}
