void reverseString(char* s, int sSize) {
    int left=0,right=sSize-1;
    for(int i=0;i<sSize;i++)
    {
        while(left<right)
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }    
    }
}