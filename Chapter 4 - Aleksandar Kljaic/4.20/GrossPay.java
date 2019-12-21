import java.util.Scanner;

import java.util.Scanner;

public class GrossPay
{

public static void main( String[] args )
{

Scanner input = new Scanner( System.in );

double hours;
double pay;
double overtime;

System.out.print( "Enter the number of regular hours Employee 1 worked: ");
hours = input.nextDouble();

System.out.print( "Enter the number of overtime hours Employee 1 worked: " );
overtime = input.nextDouble();

System.out.print( "Enter the payrate of Employee 1:  " );
pay = input.nextDouble();

if (overtime == 0 )

System.out.printf( "Gross pay for Employee 1 is %.2f\n:", hours * pay );

else
{

System.out.printf( "Gross pay for Employee 1 is %.2f\n:", (hours * pay) +
(overtime * (pay * 1.5)) );

}


System.out.print( "Enter the number of regular hours Employee 2 worked: ");
hours = input.nextDouble();

System.out.print( "Enter the number of overtime hours Employee 2 worked: " );
overtime = input.nextDouble();

System.out.print( "Enter the payrate of Employee 2: " );
pay = input.nextDouble();

if (overtime == 0 )

System.out.printf( "Gross pay for Employee 2 is %.2f\n", hours * pay );

else
{

System.out.printf( "Gross pay for Employee 2 is %.2f\n", (hours * pay) +
(overtime * (pay * 1.5)) );

}

System.out.print( "Enter the number of regular hours Employee 3 worked: " );
hours = input.nextDouble();

System.out.print( "Enter the number of overtime hours Employee 3 worked: " );
overtime = input.nextDouble();

System.out.print( "Enter the payrate of Employee 3: " );
pay = input.nextDouble();

if (overtime == 0 )

System.out.printf( "Gross pay for Employee 3 is %.2f\n", hours * pay );

else
{

System.out.printf( "Gross pay for Employee 3 is %.2f\n", (hours * pay) +
(overtime * (pay * 1.5)) );

}

}

}