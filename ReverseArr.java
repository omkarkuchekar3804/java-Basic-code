/*import java.util.*;
public class ReverseArr{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int []arr=new int [size];
        System.out.println("Enter the array element");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The reverse array is");
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}*/

import java.util.*;
public class ReverseArr{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the Array Element");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Reverse Array is");
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}