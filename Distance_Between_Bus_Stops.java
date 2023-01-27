class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int ans=0,n=distance.length;
        int i=start;
        int j=destination;
        while(i!=j){
            ans+=distance[i];
            i=(i+1)%n;//To ge to the next elements for clockwise is given (i+1)/n.
        }
        int ans2=0;
        i=start;j=destination;
        while(i!=j){
            i--;
            if(i<0)
                i=n-1;//Now to go anticlockwise , its simple just --i , and when i==-1 just rest it to n-1.
            ans2+=distance[i];
        }
      //now return which path takes minimum distance.
        return Math.min(ans,ans2);
    }
}
