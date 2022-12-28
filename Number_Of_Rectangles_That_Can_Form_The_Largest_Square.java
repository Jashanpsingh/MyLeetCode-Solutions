class Solution {
	public int countGoodRectangles(int[][] rectangles) {
		int m = 0;
		int c = 0;
		for (int[] i: rectangles){
			int n = Math.min(i[0], i[1]);
			if (n > m){
				c = 1;
				m = n;
			} else if (n == m){
				c++;
			}
		} 
		return c;
	}
}
