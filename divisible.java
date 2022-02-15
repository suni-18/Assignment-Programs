import java.util.*;
class divisible
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value:");
num=sc.nextInt();
if (num%5==0 && num%11==0)
{
    System.out.println("numbers are divisible");
}
else
{
    System.out.println("numbers are not divisible");
}
}
}