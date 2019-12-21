public class Table
{
public static void main( String args[] )
{
int n = 1;

System.out.println( "N\t10*N\t100*N\t1000*N\n" );

while ( n <= 5 )
{
System.out.printf( "%d\t%d\t%d\t%d\n",
n, ( 10 * n ), ( 100 * n ), ( 1000 * n ) );
n++;
}
} 
}