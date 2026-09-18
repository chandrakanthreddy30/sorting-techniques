package Dsajava.arrays.sorting;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //insertion sort
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        //time complexity is O(n^2) in worest case 
        // in best case O(n)
        //space O(1)
    }
}
