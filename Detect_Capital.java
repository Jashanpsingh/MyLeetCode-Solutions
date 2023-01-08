class Solution {
    public boolean detectCapitalUse(String word) {
        // first condition (Ex. "", "p", "M")
        if(word.length() < 2) return true;

        // Matching first 2 characters for wrong condition (Ex. "pG")
        if(Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) return false;

        // Only run loop for more than 1 character
        for(int i = 2; i<word.length(); i++){

            // if index 1 character is Uppercase then there should not be any Lowercase in word (Ex. "MAsAi")

            if(Character.isUpperCase(word.charAt(1)) && Character.isLowerCase(word.charAt(i))) return false;

            // Vice-Versa of above condition (Ex. "MaSAI")
            // if index 1 character is Lowercase then there should not be any Uppercase in word (Ex2. "panKaJ")
            
            if(Character.isLowerCase(word.charAt(1)) && Character.isUpperCase(word.charAt(i))) return false;
        }
        return true;
    }
}
