class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] s = sentence.split(" ");
        
        if(s.length==1){              //Edge case when sentence length is one
            if(s[0].charAt(0)!= s[0].charAt(s[0].length()-1)){
                return false;
            }
        }
        
        
        for(int i=1;i<s.length;++i){
                if(s[i].charAt(0)!=s[i-1].charAt(s[i-1].length()-1)){    //just comparing first character of current string to last 
                    return false;                                                        //character of previous string
                }
                if(i==s.length-1){
                    if(s[i].charAt(s[i].length()-1)!=s[0].charAt(0)){            //checking last string with first string
                    return false;
                }
                }
            }
        
        return true;
    }
}
