class Solution {
    public List kidsWithCandies(int[] candies, int extraCandies) {
        List list=new ArrayList();
        int mi=0, max = candies[0];
        
        //  child with highest candies
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max){
                max= candies[i];
                mi=i;
                }
                }
                for(int i=0;i<candies.length;i++){
                    
                    if(i==mi){
                        list.add(true);  
                        continue;
                        }
                        if(candies[i]+extraCandies >= max){
                            list.add(true);
                            }
        
        if(candies[i]+extraCandies < max){
            list.add(false);
        }
    }
    return list;
    }
    }
