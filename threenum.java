import java.util.*;
class threenum
{
public static void main(String args[])
{
int a, b, c;
Scanner sc=new Scanner(System.in);
System.out.println("enter a value:");
a=sc.nextInt();
System.out.println("enter b value:");
b=sc.nextInt();
System.out.println("enter c value:");
c=sc.nextInt();
if (a>b && a>c)
{
    System.out.println("maximum number is a:"+a);
}
    else if (b>a && b>c)
    {
        System.out.println("maximum number is b:"+b);
    }
    else
    {
        System.out.println("maximum number is c:"+c);
    }
}
}