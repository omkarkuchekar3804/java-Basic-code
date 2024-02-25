/*import java.util.*;
public class Count{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int cnt=0;
        while(num!=0){
            num=num/10;
            cnt++;
        }
        System.out.println("The total Count of Given Number is "+cnt);
        sc.close();
    }
}*/


import java.util.*;
public class Count{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("The Count of given Number is "+count);
    }
}