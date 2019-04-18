#include <stdio.h>
int facto(int n)
{
  int res = 1, i;
  if(n<=1)
    return 1;
  else{
    for (i = 2; i <= n; i++) 
        res *= i; 
    return res; 
  }
}

int main() {
	//Type your code
  int n;
  int sum=0;
  scanf("%d",&n);
  int num=n;
  while(num!=0)
  {
    int digit=num%10;
    sum=sum+facto(digit);
    num=num/10;
  }
  if(sum==n)
    printf("Yes");
  else
    printf("No");
    
	return 0;
}