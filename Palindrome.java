import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse="",temp="";
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ' || str.charAt(i)==',' || str.charAt(i)=='?')
                continue;
            temp+=str.charAt(i);
        }
        temp=temp.toLowerCase();
        
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ' || str.charAt(i)==',' || str.charAt(i)=='?')
                continue;
            reverse+=str.charAt(i);
        }
        reverse=reverse.toLowerCase();
        
        if(temp.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome and reverse ="+reverse+" temp ="+temp);
    }
}
