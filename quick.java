package Dsajava.arrays.sorting;

public class quick {
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pivotindex= arrange(arr,low,high);
            quicksort(arr, low, pivotindex-1);
           quicksort(arr, pivotindex+1, high);
        }
    }
    static int arrange(int[] arr,int low,int high){
    int pivot=arr[low];
     int i=low;
     int j=high;
     int k=0;
     while(i<j){
         while(i<high && arr[i]<=pivot){
            i++;
         }
         while (j>low && arr[j]>=pivot) {
            j--;
         }
         if(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
         }
     }
     int temp=arr[low];
     arr[low]=arr[j];
     arr[j]=temp;
     return j;
    }
    public static void main(String[] args) {
        int[] arr={5,3,1,56,7,9,9,2,3,1,7,3,9};
        quicksort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
