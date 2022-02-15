import java.util.*;
class upper
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any character:");
        ch=sc.next().charAt(0);
        if(ch>='A'&&ch<='Z')
        {
            System.out.println("character is uppercase");
        }
        else if(ch>='a'&&ch<='z')
        {
            System.out.println("character is lowercase");
        }
        else{
            System.out.println("not");
        }
    }
}