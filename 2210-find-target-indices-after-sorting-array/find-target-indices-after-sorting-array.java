// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         Arrays.sort(nums);
//         List<Integer> res = new ArrayList<>();

    
//         for(int i = 0 ; i < nums.length; i++){
//             if(nums[i] == target){
//                 res.add(i);
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smaller = 0;
        int equal = 0;
        List<Integer> res = new ArrayList<>();

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] < target)
                smaller++;
            else if(nums[i] == target)
                equal++;
        }
        for(int i = smaller ; i < smaller + equal ; i++){
            res.add(i);
        }
        return res;
    }
}
