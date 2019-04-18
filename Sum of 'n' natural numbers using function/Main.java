#include<stdio.h>
int sumNat(int n)
{
  return (n*(n+1))/2;
}
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int sum=sumNat(n);
  printf("%d",sum);
   
  	return 0;
}