class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> a=new HashMap<>();
        for(int val:nums){
            a.put(val,a.getOrDefault(val,0)+1);
        }
        for(Integer val:a.keySet() ){
            if(a.get(val)==1) return val;
        }
        return 0;
    }
}