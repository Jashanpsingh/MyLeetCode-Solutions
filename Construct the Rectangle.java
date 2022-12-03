class Solution {
    public int[] constructRectangle(int area) {
        int arr[]=new int[2];
        int ele1=0;
        for(int i=1;i*i<=area;i++)
        {
            if(area%i==0)
                ele1=i;
        }
        int ele2=area/ele1;
        arr[0]=ele2;
        arr[1]=ele1;
        return arr;
    }
}
