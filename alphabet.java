import java.util.*;
class alphabet
{
public static void main(String args[])
{
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter character:");
    ch=sc.next().charAt(0);
    if ((ch>='a' && ch<= 'z') || (ch>='A' && ch<= 'Z'))
    {
        System.out.println("character is alphabet");
    }
    else
    {
        System.out.println("character is not a alphabet");
    }
}
}