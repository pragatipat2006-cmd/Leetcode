class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int left = 0;
        int right = nums.length - 1 ;

        int mid = (left + right) / 2;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length; i++){
            if(i != mid && nums[mid]==nums[i]){
                return false;
            }
        }
        return true;
    }
}