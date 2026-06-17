int firstUniqChar(char* s) {
    int count[26] = {0};

    for(int i = 0; s[i] != '\0'; i++) {
        int index = s[i] - 'a';
        count[index] = count[index] + 1;
    }

    for(int i = 0; s[i] != '\0'; i++) {
        int index = s[i] - 'a';

        if(count[index] == 1) {
            return i;
        }
    }

    return -1;
}