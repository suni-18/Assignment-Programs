/* 1-50---0.50
51-100-----0.75
101-200----2.56
above200----5.67
*/
import java.util.*;
class electricity
{
    public static void main(String args[])
    {
        double eu, ebill;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter units:");
        eu=sc.nextDouble();
        if(eu<50){
            ebill=eu*0.50;
        }
        else if(eu<100){
            ebill=(50*0.50)+((eu-50)*0.75);
        }
        else if(eu<200){
            ebill=(50*0.50)+(50*0.75)+((eu-100)*2.56);
        }
        else
        {
            ebill=(50*0.50)+(50*0.75)+(100*2.56)+((eu-200)*5.67);
        }
        System.out.println("the electricity bill is:"+ebill);
    }
}