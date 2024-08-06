
#include <stdio.h>
void swap(int a,int b,int *arr){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
void selectionSort(int *arr,int n){
    for(int i=0;i<n-1;i++){
	    int min = i;
	    for(int j=i+1;j<n;j++){
	        if(arr[j]<arr[min]){
	            min = j;
	        }
	    }
	    if(min!=i){
	        swap(i,min,arr);
	    }
	}
}
int main(){
    printf("Enter the Size of the Array => \n");
    int n;
    scanf("%d",&n);
    int arr[n];
    printf("Enter the element of the array => \n");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    printf("The old array is => \n");
    for(int i=0;i<n;i++){
        printf("%d\n",arr[i]);
    }

    selectionSort(arr,n);

    printf("Print the array after sorting => \n");
    for(int i=0;i<n;i++){
        printf("%d\n",arr[i]);
    }

    return 0;
}
// time complexity is :- O(n^2)