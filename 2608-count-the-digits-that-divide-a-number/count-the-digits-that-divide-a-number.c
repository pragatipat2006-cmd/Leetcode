int countDigits(int num) {
  if(num==0)
    return 0;  
  int count = 0;
  int temp = num;
  while(num>0)
  {
    int digit = num%10;
    if(temp%digit==0)
        count++;
    num = num/10;
  }  
  return count;
}