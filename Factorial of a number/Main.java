#include <stdio.h>
int facto(int n)
{
  if(n<=1)
    return 1;
  return facto(n-1)*n;
}
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int fact=facto(n);
  printf("%d",fact);
	return 0;
}