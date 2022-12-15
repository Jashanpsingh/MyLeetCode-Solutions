class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int numberOfStudents = 0;
        
        for(int i=0;i<startTime.length;i++){
            if((startTime[i] <= queryTime) &&  (queryTime <= endTime[i]))
             {
                 numberOfStudents++;
             }
         }
        return numberOfStudents;
    }
}
