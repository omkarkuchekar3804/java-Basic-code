/*import java.util.*;
public class primeNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter the Number");
        int num=sc.nextInt();
        if(num>1){
            for(int i=1; i<=num; i++){
            if(num%i==0)
            count++;
            }
        }
        if(count==2){
            System.out.println("The Given Number is Prime Number");
        }else{
            System.out.println("The Given Number is Not Prime Number");
        }
        sc.close();
    }
}*/


import java.util.*;
public class PrimeNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        boolean flag=false;
        int count=0;
        if(num>1){
            for(int i=1; i<=num; i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                flag=true;
                System.out.println("The Given Number is Prime Number");

            }
            if(flag==false){
                System.out.println("The Given Number is Not palindrome");
            }
            
        }
    }
}