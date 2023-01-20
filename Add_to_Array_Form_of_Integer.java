class Solution {
	public List<Integer> addToArrayForm(int[] A, int K) {
		LinkedList<Integer> ret = new LinkedList();

		int carry = 0;
		int i = A.length-1;
		while(i >= 0 || K > 0){
			// Extraction of A's digits
			int A_dig = 0;
			if(i >= 0){
				A_dig = A[i];
				i--;
			}
			
			// Extraction of K's digits
			int K_dig = K % 10;
			carry += A_dig + K_dig;

			ret.addFirst(carry % 10);
			carry /= 10;
			K /= 10;
		}

		if(carry == 1) ret.addFirst(1);
		return ret;
	}
}
