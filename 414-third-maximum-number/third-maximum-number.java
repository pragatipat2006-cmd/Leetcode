class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length; i++){
            set.add(nums[i]);
        }

        int[] arr = new int[set.size()];
        int i = 0;
        for(int num : set){
            arr[i++] = num;
        }

        Arrays.sort(arr);

        if(arr.length >= 3)
            return arr[arr.length - 3];
        return arr[arr.length - 1];
    }
}