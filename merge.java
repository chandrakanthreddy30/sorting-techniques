package Dsajava.arrays.sorting;

public class merge {
    static void mergesort(int[] arr,int left,int right){
        if(left>=right) return;
        int mid=(left+right)/2;
        mergesort(arr,left,mid);
        mergesort(arr,mid+1,right);
        //merging the arrays
        merge(arr,left,mid,right);
    }
    static void merge(int[] arr,int left,int mid,int right){
        int[] temp=new int[right -left+1];
        int i=left;
        int j=mid+1;
      int k=0;
      while(i<=mid && j<=right){
        if(arr[i]<=arr[j]){
            temp[k]=arr[i];
            i++;
            k++;
        }
        else{
        temp[k]=arr[j];
        j++;
        k++;
        }
      }
      while (i<=mid) {
        temp[k]=arr[i];
        i++;
        k++;
      }
      while(j<=right){
        temp[k]=arr[j];
        j++;
        k++;
      }
      for(i=0;i<temp.length;i++){
           arr[left+i]=temp[i];
      }
    }
    public static void main(String[] args) {
        int[] arr={5,3,12,6,2};
        mergesort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+ " ");
        }
    }
}
