class Solution {
   public List<Integer> maxScoreIndices(int[] nums) {
		int countOne = 0;
       //count total 1 present in nums
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				countOne++;
			}
		}
       //hold zero count
		int zeroCount = 0;
       //max score
		int max = countOne;
       //hold answer list
		List<Integer> list = new ArrayList<>();
		list.add(0);
       //iterate entire array
		for (int i = 0; i < nums.length; i++) {
            //if zero found increment zeroCount
			if (nums[i] == 0) {
				zeroCount++; //increment as we need 0 on left side only
			} else {
                //if 1 decrement countOne as we need 1 on right side only
				countOne--;
			}
            //calculate answer
			int ans = zeroCount + countOne;
            //if ans already equal max update list with current index
            if(ans==max) {
                list.add(i+1);
            } else if(ans>max) {
                //it means new max found. so just delete entire list content
                list.clear();
                //update max
                max=ans;
                //add current index to list
                list.add(i+1);
            }
		}
       //return answer
		return list;
	}
}
