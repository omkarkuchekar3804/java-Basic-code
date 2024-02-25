/*import java.util.*;
public class convow{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='o'||ch=='u'||ch=='i'){
                count++;
            }
        }
        System.out.println("The vowels are "+count);
        System.out.print("The consonet are "+(str.length()-count));
    }

}*/


 

import java.util.*;
public class Convow{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("The count of vowels are"+count);
        System.out.println("The Count of Consonents are"+(str.length()-count));
        sc.close();
    }
}