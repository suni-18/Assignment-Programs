import java.util.*;
class salary
{
    public static void main(String args[])
    {
        float bsalary,da1,hra1,da,hra,grosspay;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic salary of emp:");
        bsalary=sc.nextFloat();
        System.out.println("enter basic DA of emp:");
        da1=sc.nextFloat();
        System.out.println("enter basic HRA of emp:");
        hra1=sc.nextFloat();
        da=(da1*bsalary)/100;
        hra=(hra1*bsalary)/100;
        grosspay=bsalary+da+hra;
        System.out.println("gross salary of employee:"+grosspay);
    }
}
        