/*import java.util.*;
public class Asc{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int []arr=new int [size];
        System.out.println("Enter the array element");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The Ascendig order of array is ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }

}*/

import java.util.*;
public class Asc{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the Array element");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The Ascending ordder of element is");
        for(int i=0; i<arr.length;  i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}