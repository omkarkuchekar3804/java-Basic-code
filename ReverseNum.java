/*import java.util.*;
public class ReverseNum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("The reverse Number is "+rev);
        if(temp==rev){
            System.out.println("the Given number is palindrome");
        }else{
            System.out.println("The Given Number is not palindrome");
        }
        sc.close();
    }
}*/



import java.util.*;
public class ReverseNum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int rev=0;
        int temp=num;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("The Reverse Number is"+rev);
        if(temp==rev){
            System.out.println("The given Number is palindrome");
        }else{
            System.out.println("The Given Number is not Palindrome");
        }
    }
}