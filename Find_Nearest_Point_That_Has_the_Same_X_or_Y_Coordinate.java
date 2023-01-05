class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {

        //default answer is -1
        //smallestDistance is the max value of x, y, a, b
        int ans = -1;
        int smallestDistance = 10001;

        //iteration for every point in points
        for (int i = 0; i < points.length; i++) {

            //if a = x or b = y
            if (points[i][0] == x || points[i][1] == y) {

                //calculate the manhattan distance between the point (a|b) and (x|y)
                int distance = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);

                //if the manhattan distance is smaller than the smallest distance
                //which for the first time is always true
                if (distance < smallestDistance){

                    //override the smallest distance with the distance
                    //and override the answer with the current iteration as index
                    smallestDistance = distance;
                    ans = i;
                }
            }
        }

        //finally, return the answer
        return ans;
    }
}
