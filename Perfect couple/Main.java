#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);
    
    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);
    
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int arr[], int size, int sum)
{
  // Type your code here
   int cnt=0,i,j,index1,index2;
  for(i=0;i<size;i++){
    for(j=i+1;j<size;j++){
      if((arr[i]+arr[j])==sum){
         cnt=1;
        index1=i;
        index2=j;
        break;
      }
    }
  }
  if(cnt==1)
    printf("Perfect couple: %d %d",arr[index1],arr[index2]);
  else
    printf("No perfect couple found!");
  
  
  
}