/*import java.util.*;

public class SumOfDigit {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
       sum=sum+num%10;
       num=num/10;
        }
        System.out.println("The Sum of digit are "+sum);
        sc.close();
    }
    
}*/


import java.util.*;
public class SumOfDigit{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
        sum=sum+num%10;
        num=num/10;
        }
        System.out.println("The Sum of digits are "+sum);
        sc.close();
    }
}
