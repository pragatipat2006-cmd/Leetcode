#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char** fizzBuzz(int n, int* returnSize) {
    *returnSize = n;

    char** result = (char**)malloc(n * sizeof(char*));

    for (int i = 0; i < n; i++) {
        result[i] = (char*)malloc(9 * sizeof(char)); // enough for "FizzBuzz" + '\0'

        int num = i + 1;

        if (num % 3 == 0 && num % 5 == 0) {
            strcpy(result[i], "FizzBuzz");
        }
        else if (num % 3 == 0) {
            strcpy(result[i], "Fizz");
        }
        else if (num % 5 == 0) {
            strcpy(result[i], "Buzz");
        }
        else {
            sprintf(result[i], "%d", num);
        }
    }

    return result;
}