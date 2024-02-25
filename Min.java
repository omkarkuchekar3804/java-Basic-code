/*import java.util.*;
public class Min{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the array element");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Minimum number is "+min);
        sc.close();
    }
}*/



import java.util.*;
public class Min{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the Array element");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Minimum element is "+min);
    }
}