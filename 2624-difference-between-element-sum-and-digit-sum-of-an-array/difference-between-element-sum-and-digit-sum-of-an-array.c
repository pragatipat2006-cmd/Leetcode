#include <stdlib.h>

int differenceOfSum(int* nums, int numsSize) {
    int ele_sum = 0;
    int digit_sum = 0;

    for(int i = 0; i < numsSize; i++) {
        ele_sum += nums[i];

        int temp = nums[i];

        while(temp > 0) {
            digit_sum += temp % 10;
            temp /= 10;
        }
    }

    return abs(ele_sum - digit_sum);
}