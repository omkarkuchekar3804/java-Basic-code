/*import java.util.*;
public class Dup{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int []arr=new int [size];
        System.out.println("Enter the array element");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    System.out.println("The Duplicate element is "+arr[i]);
                }
            }
        }
        if(flag==false){
            System.out.println("There is no duplicate element");
        }
        sc.close();
    }
}*/



import java.util.*;
public class Dup{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter thhe size");
        int size=sc.nextInt();
        boolean flag=false;
        int []arr=new int[size];
        System.out.println("Enter the Array element");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    System.out.println("The Duplicate element is "+arr[i]);
                }
            }
        }if(flag==false){
            System.out.println("There is no Duplicate element");
        }
    }
}