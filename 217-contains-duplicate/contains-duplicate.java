// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         boolean flag = false;
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i+1; j < nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     flag = true;
//                     break;
//                 }
//             }
//         }
//         return flag;
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            if(map.containsKey(temp)){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}