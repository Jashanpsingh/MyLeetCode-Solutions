public class Solution {
public int lengthOfLastWord(String s) {

    //store length of the string
    int Len = s.length()-1;
    //variable to store the index of last character of the last word
    int back = 0;
    
    if(Len < 0)
        return 0;
    
    //iterate to the first non-white-space character from the back in s
    while(s.charAt(Len) == ' ')
    {
        Len--;
        if(Len < 0)
            return 0;
    }

    back = Len;
    
    //iterate till encounter the first space from backside in s
    while(s.charAt(Len) != ' ')
    {
        Len--;
        if(Len < 0)
            break;
    }
    
    return back - Len;
    
    
}
}
