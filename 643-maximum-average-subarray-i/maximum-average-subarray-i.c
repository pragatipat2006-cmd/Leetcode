double findMaxAverage(int* nums, int numsSize, int k) {
    int sum = 0;
    int left =0;
    int right = k-1;
    for(int i=left;i<=right;i++){
        sum = sum + nums[i];
    }
    double avg = (double)sum/k;
    int maxSum = sum;
    while(right<numsSize-1){
        sum = sum - nums[left];
        left++;
        right++;
        sum = sum + nums[right];
        if(sum>maxSum)
        {
            maxSum = sum;
            avg = (double)maxSum/k;
        }
    }
    return avg;
}