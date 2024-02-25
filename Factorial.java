/*import java.util.*;
public class factorial{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println("The Factorial of given number is "+fact);
        sc.close();
    }
}*/



import java.util.*;
public class Factorial{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println("The Factorial of Given Number is "+fact);
    }
}