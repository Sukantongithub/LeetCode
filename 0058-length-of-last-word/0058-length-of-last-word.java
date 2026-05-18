class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        int len=str.length(),count=0;
        for(int i=len-1; i>=0 && str.charAt(i)!=' '  ;i--){
            count++;
        }
        return count;
    }
}