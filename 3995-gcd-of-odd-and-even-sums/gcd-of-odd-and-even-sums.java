class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;

        for(int i=1;i<=n*2;i++){
            if(i%2 == 0)
                sumEven += i;
            else 
                sumOdd += i;
        }
        if(sumEven<sumOdd){
            while(sumOdd!=0){
                int temp = sumOdd;
                sumOdd = sumEven%sumOdd;
                sumEven = temp;
            }
            return sumEven;
        }
        else
        {
            while(sumEven!=0){
                int temp = sumEven;
                sumEven = sumOdd%sumEven;
                sumOdd = temp;
            }
            return sumOdd;
        }
    }
}