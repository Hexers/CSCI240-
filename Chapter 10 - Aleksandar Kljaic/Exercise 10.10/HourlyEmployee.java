// Exercise 10.10 - Payroll System Modification
// Aleksandar Kljaic - November 10, 2014

public class HourlyEmployee extends Employee
{
   private double wage; // wage per hour
   private double hours; // hours worked for week
 
   // five-argument constructor
   public HourlyEmployee( String first, String last, String ssn, Date DayOfBirth, double hourlyWage, double hoursWorked )
   {
      super( first, last, ssn, DayOfBirth);
      setWage( hourlyWage ); // validate and store hourly wage
      setHours( hoursWorked ); // validate and store hours worked
   } // end five-argument HourlyEmployee constructor
 
   // set wage
   public final void setWage( double hourlyWage )
   {
      wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
   } // end method setWage
 
   // return wage
   public double getWage()
   {
      return wage;
   } // end method getWage
 
   // set hours worked
   public final void setHours( double hoursWorked )
   {
      hours = ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) ) ?
         hoursWorked : 0.0;
   } // end method setHours
 
   // return hours worked
   public double getHours()
   {
      return hours;
   } // end method getHours
 
   // calculate earnings; override abstract method earnings in Employee
   public double earnings()
   {
      if ( getHours() <= 40 ) // no overtime
         return getWage() * getHours();
      else
         return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
   } // end method earnings
 
   // return String representation of HourlyEmployee object
    @Override
   public String toString()
   {
      return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
         super.toString(), "hourly wage", getWage(),
         "hours worked", getHours() );
   } // end method toString
} // end class HourlyEmployee