import java.util.Arrays;

public class Quick {
    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int particition(int arr[],int l,int r){
        int pivot = arr[r];
        int i = l-1;
        for(int j=l;j<=r-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1, r);
        return i+1;
    }
    public static void quickSort(int[]arr,int l,int r){
        if(l<r){
            int i = particition(arr,l,r);
            quickSort(arr, l, i-1);
            quickSort(arr, i+1, r);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
// time complexity in best case is:- O(nlog n) and for the best case it is O(n^2)