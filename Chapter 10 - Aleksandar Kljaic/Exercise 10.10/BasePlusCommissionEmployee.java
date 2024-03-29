// Exercise 10.10 - Payroll System Modification
// Aleksandar Kljaic - November 10, 2014

public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary; // base salary per week
 
   // six-argument constructor
   public BasePlusCommissionEmployee( String first, String last,
      String ssn, Date DayOfBirth,double sales, double rate, double salary )
   {
      super( first, last, ssn, DayOfBirth,sales, rate );
      setBaseSalary( salary ); // validate and store base salary
   } // end six-argument BasePlusCommissionEmployee constructor
 
   // set base salary
   public final void setBaseSalary( double salary )
   {
      baseSalary = ( salary < 0.0 ) ? 0.0 : salary; // non-negative
   } // end method setBaseSalary
 
   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } // end method getBaseSalary
 
   // calculate earnings; override method earnings in CommissionEmployee
    @Override
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   } // end method earnings
 
   // return String representation of BasePlusCommissionEmployee object
    @Override
   public String toString()
   {
      return String.format( "%s %s; %s: $%,.2f",
         "base-salaried", super.toString(),
         "base salary", getBaseSalary() );
   } // end method toString
} // end class BasePlusCommissionEmployee