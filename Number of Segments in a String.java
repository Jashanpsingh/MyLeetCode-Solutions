class Solution {
public int countSegments(String s) {
    int ctr=0;
    String[] arr = s.split(" ");
    for(String x : arr){
        if(x.length()>0)
    ctr++;
    }
    return ctr;
}
}
