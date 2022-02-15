import java.util.*;
class threenum
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value:");
n=sc.nextInt();
if (n>0)
{
    System.out.println("n value is positive");
}
else if(n<0)
{
    System.out.println("n value is negative");
}
else{
    System.out.println("n value is zero");
}
}
}