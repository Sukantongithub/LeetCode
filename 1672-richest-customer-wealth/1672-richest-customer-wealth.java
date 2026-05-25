class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] val:accounts){
            int sums=0;
            for(int val1:val){
                sums+=val1;
            }
            if(max<sums) max=sums;
        }
        return max;
    }
}