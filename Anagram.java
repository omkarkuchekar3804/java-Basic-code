/*import java.util.*;
public class Anagram{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.length()==str2.length()){
            char []arr=str1.toCharArray();
            char []brr=str2.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(brr);
            if(Arrays.equals(arr,brr)){
                System.out.println("the Given string is Anagram");
            }
            

        }else{
            System.out.println("the Given string is not Anagram");
            sc.close();
        }
    }
}*/


import java.util.*;
public  class Anagram{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.length()==str2.length()){
            char[]arr1=str1.toCharArray();
            char[]arr2=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("the Given String is Anagram");
            }else{
                System.out.println("The Given String is not Anagram");
            }
        }
    }
}

