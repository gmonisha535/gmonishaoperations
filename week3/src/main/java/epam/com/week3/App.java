package epam.com.week3;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Select 1.Addition(+) 2.Subtraction(-) 3.Multiplication(*) 4.Division(/)");
        int o=s.nextInt();
        switch(o) {
        case 1:
        	System.out.println("Select 2 numbers for the operation");
        	double m=s.nextDouble();
        	double n=s.nextDouble();
        	Add s1=new Add(m,n);
        	System.out.println("Result "+s1.add());
        	break;
        case 2:
        	System.out.println("Select 2 numbers for the operation");
        	double a=s.nextDouble();
        	double b=s.nextDouble();
        	Sub s2=new Sub(a,b);
        	System.out.println("Result "+s2.sub());
        	break;
        case 3:
        	System.out.println("Select 2 numbers for the operation");
        	double c=s.nextDouble();
        	double d=s.nextDouble();
        	Mult s3=new Mult(c,d);
        	System.out.println("Result "+s3.mult());
        	break;
        case 4:
        	System.out.println("Select 2 numbers for the operation");
        	double e=s.nextDouble();
        	double f=s.nextDouble();
        	if((e==0 && f==0)||f==0) {
        		System.out.println("Can't be divided by 0");
        	}
        	else {
        		Div d1=new Div(e,f);
        		System.out.println("Result "+d1.div());
        	}
        	break;
        default:
        	System.out.println("Invalid number");
        }
    }
}
