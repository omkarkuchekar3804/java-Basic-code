/*import java.util.*;
public class SumOfArr{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int []arr=new int [size];
        int sum=0;
        System.out.println("Enter the array element");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum of arary is "+sum);
        sc.close();

    }
}*/


import java.util.*;
public class SumOfArr{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int []arr=new int [size];
        int sum=0;
        System.out.println("Enter the Array element");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The sum of Array is ");
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        sc.close();

    }
}