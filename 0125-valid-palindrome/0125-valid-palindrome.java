class Solution {
    public boolean isPalindrome(String s) {
        String aa=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i=0,j=aa.length()-1;i<=j;i++,j--){
            if(aa.charAt(i)!=aa.charAt(j))    return false;
        }
        return true;
    }
}