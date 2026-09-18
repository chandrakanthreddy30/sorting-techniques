package Dsajava.arrays.sorting;
import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
     int[] arr=new int[5];
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //selection sort
        for(int i=0;i<n;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
               if(arr[j]<arr[minindex]){
                minindex=j;
               }
            }
            //swap
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        //time complexity  in all cases is O(n^2)
        //space complexity is O(1)
    }
}
