class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int ansId = logs[0][0], endTime = logs[0][1];
        for(int i = 1; i < logs.length; i++) {
            int time = logs[i][1] - logs[i - 1][1];
            if(time > endTime) {
                endTime = time;
                ansId = logs[i][0];
            } else if(time == endTime)
                ansId = Math.min(ansId, logs[i][0]);   
        }
        return ansId;
    }
}
