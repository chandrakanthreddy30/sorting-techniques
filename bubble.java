package Dsajava.arrays.sorting;
import java.util.Scanner;
public class bubble {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped =false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap 
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
       for(int i=0;i<n;i++){
        System.out.print(arr[i]);
       }
         sc.close();
         //time complexity in worest case : O(n^2);
         //time complexity in best case :O(n)  //swapped variable
         //space complexity is O(1)

    }
}