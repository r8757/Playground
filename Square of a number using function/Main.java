#include<stdio.h>
int squarefun(int n)
{
  return n*n;
}
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  int square=squarefun(n);
  printf("%d",square);
   return 0;
}