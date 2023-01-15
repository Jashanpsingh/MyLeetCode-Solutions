class Solution {
    public String dayOfTheWeek(int day, int month, int year) 
    {
        int[] mon={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dayofweek={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
       
        //initialize sum to 4 which is Thurday end of 1970 Dec 31 which is Thursday
        int sum=4;
        
        // Check for leapyear ie it should de divisible by 4 but not 100 or it is divisible by 40 add 365 if not and add 366 if it is leapyear for all years from 1971 till before year
        
        for(int i=1971;i<year;i++)
        {
            if((i%4==0&&i%100!=0)||i%400==0)sum+=366;
            else sum=sum+365;
        }
        
        // add month days based on days in each month till before given month add extra 1 day for leapyear feb
        for(int i=1;i<month;i++)
        {
            if(i==2&&((year%4==0&&year%100!=0)||year%400==0))sum++;
            sum=sum+mon[i];
        }
        
        // add those days
        sum=sum+day;
        
        //finally get the remainder of total days when divisible by 7
        return dayofweek[sum%7];
        
            
    }
}
