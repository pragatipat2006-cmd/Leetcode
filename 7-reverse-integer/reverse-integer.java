class Solution {
    public int reverse(int x) {
        long rev = 0;
        int temp = x;
        if(x<0){
            x = -(x);
        }
        while(x > 0){
            int digit = x % 10;
            rev = rev * 10 + digit ;
            x = x / 10;
        }
        if(temp < 0){
            rev = -(rev);
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        return (int)rev;
    }
}

