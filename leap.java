import java.util.*;
class leap
{
public static void main(String args[])
{
int year;
Scanner sc=new Scanner(System.in);
System.out.println("enter year:");
year=sc.nextInt();
if (year%4==0)
{
    System.out.println("leap year");
}
else
{
    System.out.println("non leap year");
}
}
}