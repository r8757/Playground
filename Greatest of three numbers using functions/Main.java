#include <stdio.h>
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  int grt=n1<n2?n2:n1;
  grt=grt<n3?n3:grt;
  printf("%d",grt);
  	return 0;
}