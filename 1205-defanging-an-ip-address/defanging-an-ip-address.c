#include <stdlib.h>

char * defangIPaddr(char * address) {
    char *ans = (char *)malloc(100);
    
    int i, j = 0;

    for (i = 0; address[i] != '\0'; i++) {
        if (address[i] == '.') {
            ans[j++] = '[';
            ans[j++] = '.';
            ans[j++] = ']';
        } else {
            ans[j++] = address[i];
        }
    }

    ans[j] = '\0';
    return ans;
}