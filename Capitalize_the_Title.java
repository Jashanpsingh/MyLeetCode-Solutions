class Solution {
    public String capitalizeTitle(String s) 
    {
        s = s.toLowerCase();
        String str[] = s.split(" ");
        for(int i=0; i<str.length; i++)
        {
            if(str[i].length() > 2)
            {
            char w = Character.toUpperCase(str[i].charAt(0));
            str[i] = w + str[i].substring(1);
            }
        }
        String ans = "";
        for(int i=0; i<str.length; i++)
        {
            ans += str[i] + " ";
        }
        return ans.trim();
    }
}
