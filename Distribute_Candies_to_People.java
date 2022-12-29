class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int k=0,v=1;
        while(candies>0){
            if(k == num_people)
            k = k % num_people; //to loop through the array
            if(candies < v){
                ans[k] += candies; break;
            }
            ans[k++] += v;
            candies -= v++;
        }
        return ans;
    }
}
