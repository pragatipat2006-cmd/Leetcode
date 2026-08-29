class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums1.length ; i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> result = new HashSet<>();
        for(int i = 0; i< nums2.length;i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }

        int[] ans = new int[result.size()];
        Integer[] temp = result.toArray(new Integer[0]);
        for(int i = 0; i< ans.length;i++){
            ans[i] = temp[i];
        }
        return ans;
    }
}