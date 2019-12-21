// Exercise 10.10 - Payroll System Modification
// Aleksandar Kljaic - November 10, 2014

public class PayrollSystemTest
{
   public static void main( String args[] )
   {
      // create subclass objects
      Date currentDate = new Date(11,10,2014);
      System.out.printf( "Current Date is: %s\n", currentDate.toString() );
      System.out.println("###################################");
      SalariedEmployee salariedEmployee =
         new SalariedEmployee( "Jonathan", "Burns", "111-11-1111", new Date(5,11,1984),800.00 );
      HourlyEmployee hourlyEmployee =
         new HourlyEmployee( "Kathleen", "Swims", "222-22-2222", new Date(6,15,1988),16.75, 40 );
      CommissionEmployee commissionEmployee =
         new CommissionEmployee(
         "Susan", "Runs", "333-33-3333", new Date(8,25,1974),10000, .06 );
      BasePlusCommissionEmployee basePlusCommissionEmployee =
         new BasePlusCommissionEmployee(
         "Robert", "Williams", "444-44-4444", new Date(9,27,1978),5000, .04, 300 );
      PieceWorker pieceWorker = new PieceWorker("William", "Writes", "777-223-987",
              new Date(6,25,1985), 213, 16);
 
      System.out.println( "Employees processed individually:\n" );
 
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         salariedEmployee, "earned", salariedEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         hourlyEmployee, "earned", hourlyEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         commissionEmployee, "earned", commissionEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         basePlusCommissionEmployee,
         "earned", basePlusCommissionEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
              pieceWorker, "earned", pieceWorker.earnings() );
 
      // create four-element Employee array
      Employee employees[] = new Employee[ 5 ];
 
      // initialize array with Employees
      employees[ 0 ] = salariedEmployee;
      employees[ 1 ] = hourlyEmployee;
      employees[ 2 ] = commissionEmployee;
      employees[ 3 ] = basePlusCommissionEmployee;
      employees[ 4 ] = pieceWorker;
 
      System.out.println("###################################");
      System.out.println( "Employees processed polymorphically:\n" );
 
      // generically process each element in array employees
      for ( Employee currentEmployee : employees )
      {
         System.out.println( currentEmployee ); // invokes toString
 
         // determine whether element is a BasePlusCommissionEmployee
         if ( currentEmployee instanceof BasePlusCommissionEmployee )
         {
            // downcast Employee reference to
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee =
               ( BasePlusCommissionEmployee ) currentEmployee;
 
            double oldBaseSalary = employee.getBaseSalary();
            employee.setBaseSalary( 1.10 * oldBaseSalary );
            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f\n",
               employee.getBaseSalary() );
         } // end if
 
         if(currentDate.getMonth()==currentEmployee.getBirthday().getMonth())
         {
             System.out.printf("earned $%,.2f. %s\n\n", currentEmployee.earnings() + 100.00,
                     "Note: added a $100 bonus to your payroll amount for birthday!!!" );
         }else{
             System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings() );
         }
      } // end for
 
      // get type name of each object in employees array
      for ( int j = 0; j < employees.length; j++ )
         System.out.printf( "Employee %d is a %s\n", j,
            employees[ j ].getClass().getSimpleName() );
   } // end main
} // end class PayrollSystemTest