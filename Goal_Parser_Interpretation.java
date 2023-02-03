class Solution {
    public String interpret(String command) {
       char[] str = command.toCharArray();
        String fi="";
        for(int i=0;i<str.length;i++){
            if(str[i]=='G'){
                fi=fi+str[i];
            }
            else if(str[i]=='(' && str[i+1]==')'){
                fi=fi+'o';
            }
            else if(str[i]=='(' && str[i+1]=='a'){
                fi= fi+"al";
            }
            
        }
        return fi;
    }
}
