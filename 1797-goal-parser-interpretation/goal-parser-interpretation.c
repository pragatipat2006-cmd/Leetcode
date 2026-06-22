#include <stdlib.h>

char * interpret(char * command) {
    char *ans = (char *)malloc(101);
    int j = 0;

    for (int i = 0; command[i] != '\0'; ) {
        if (command[i] == '(' && command[i + 1] == ')') {
            ans[j] = 'o';
            j++;
            i += 2;
        }
        else if (command[i] == '(') {  
            ans[j] = 'a';
            j++;
            ans[j] = 'l';
            j++;
            i += 4;
        }
        else {
            ans[j++] = command[i];  
            i++;
        }
    }

    ans[j] = '\0';
    return ans;
}