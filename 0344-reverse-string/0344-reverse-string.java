class Solution {
    public void reverseString(char[] s) {
        char[] rev=s.clone();
        for(int i=0,j=s.length-1;i<s.length;i++,j--)  s[i]=rev[j];
    }
}