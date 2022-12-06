// case 1 : if we see [0-9] we reset the numberSeen flag.
// case 2 : we can only see '.' if we didn't see e or . .
// case 3 : we can only see 'e' if we didn't see 'e' but we see a number then we reset the numberSeen flag.
// case 4 : we can only see '+' and '-' in the beginning and after an 'e'
// case 5 : any other character break the validation.
class Solution {
public boolean isNumber(String s) {
    s = s.trim();

    boolean pointSeen = false;
    boolean eSeen = false;
    boolean numberSeen = false;

    for (int i = 0; i < s.length(); i++) {
        if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            numberSeen = true;
        }
      else if(s.charAt(i) == '.'){
            if(eSeen || pointSeen){
                return false;
            }
            pointSeen = true;
        }
      else if(s.charAt(i) == 'e' || s.charAt(i) == 'E'){
            if(eSeen || !numberSeen){
                return false;
            }
            numberSeen = false;
            eSeen = true;
        }
      else if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            if(i != 0 && s.charAt(i-1) != 'e'){
                return false;
            }
        }
      else {
            return false;
        }
    }
    return numberSeen; 
}
}
