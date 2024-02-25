/*import java.util.*;
public class ReverseString{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String rev="";
        String str=sc.nextLine();
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);

        }
        System.out.println("The  reverse String is "+rev);

        if(str.equals(rev)){
            System.out.println("The Given String is palindrome");
        }else{
            System.out.println("The Given String is Not palindrome");
        }
            sc.close();
    }
}*/


import java.util.*;
public class ReverseString{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("The Revere String is  "+rev);
        if(str.equals(rev)){
            System.out.println("The Given string is Palindrome");
        }else{
            System.out.println("The Given String is not palindrome");
        }
    }
}