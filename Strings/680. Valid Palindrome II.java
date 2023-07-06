class Solution {
    public boolean validPalindrome(String s) {
       return isPalindrome(s, 0, s.length() - 1, 1);
    }
    
    boolean isPalindrome(String s, int start, int end, int deletionLeft) {
        if(start >= end) return true;
        if(s.charAt(start) == s.charAt(end)) return isPalindrome(s, start +1, end -1, deletionLeft);
        
        if(deletionLeft == 0) return false;
        
        return isPalindrome(s, start +1, end, deletionLeft - 1)  || isPalindrome(s, start, end - 1, deletionLeft - 1);
    }
}