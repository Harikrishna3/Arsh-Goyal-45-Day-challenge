class Solution {
    public int strStr(String haystack, String needle) {
       if(needle.length() == 0) return 0;
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.charAt(i) != needle.charAt(0)) continue;
            
            //find the first char
            int j = i; int k = 0;
            while(j < haystack.length() && k < needle.length() && haystack.charAt(j) == needle.charAt(k)) {
                j++; k++;
            }
            if(k == needle.length()) return i;
            
        }
        
        return -1;
        
    }
}