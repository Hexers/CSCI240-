public class DateTest
{
public static void main( String args[] )
{
Date date1 = new Date( 7, 4, 2004 );

System.out.print( "The initial date is: " );
date1.displayDate();


date1.setMonth( 11 );
date1.setDay( 1 );
date1.setYear( 2003 );

System.out.print( "\nDate with new values is: " );
date1.displayDate();

System.out.println();
}
}
