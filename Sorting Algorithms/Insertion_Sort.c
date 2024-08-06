#include <stdio.h>

void bubbleSort(int *arr,int n){
    for(int i=1;i<n;i++){
        int key = arr[i];
        int j = i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1] = key;
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

    bubbleSort(arr,n);

    printf("Print the array after sorting => \n");
    for(int i=0;i<n;i++){
        printf("%d\n",arr[i]);
    }

    return 0;
}
// time complexity is :- O(n^2)
// space complexity is :- O(1)