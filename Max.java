/*import java.util.*;
public class Max{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=sc.nextInt();
    int[] arr=new int [size];
    System.out.println("The Array element are");
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(int i=0; i<arr.length; i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    System.out.println("The maximum element is "+max);
    sc.close();
  }
  
}*/


import java.util.*;
public class Max{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int size=sc.nextInt();
    int []arr=new int [size];
    System.out.println("Enter the array element");
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
    int max=arr[0];
    for(int i=0;  i<arr.length; i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
    System.out.println("The Maximum Element is"+max);

  }
}