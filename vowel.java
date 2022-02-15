import java.util.*;
class vowel
{
public static void main(String args[])
{
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any alphabet:");
    ch=sc.next().charAt(0);
    if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    {
        System.out.println("it is vowel");
    }
    else
    {
        System.out.println("it is consonent");
    }
}
}