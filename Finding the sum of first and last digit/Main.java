#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int sum=n%10;
  int temp=0;
  while(n>0)
  {
    temp=n%10;
    n=n/10;
    if(n==0)
      sum=sum+temp;
  }
  printf("%d",sum);
	return 0;
}