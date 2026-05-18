class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> visit=new HashSet<>();
            for(int a:nums){
                if(visit.contains(a))   return true;
                else    visit.add(a);
        }
        return false;
    }
}