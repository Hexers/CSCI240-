public class EmployeeTest
{
public static void main( String args[] )
{
Employee employee1 = new Employee( "Brandon", "Brandonship", 2875.00 );
Employee employee2 = new Employee( "Amber", "Amberfield", 3150.75 );
System.out.printf( "Employee 1: %s %s; Yearly Salary: %.2f\n",
employee1.getFirstName(), employee1.getLastName(),
12 * employee1.getMonthlySalary() );
System.out.printf( "Employee 2: %s %s; Yearly Salary: %.2f\n",
employee2.getFirstName(), employee2.getLastName(),
12 * employee2.getMonthlySalary() );


System.out.println( "\nIncreasing employee salaries by 10%" );
employee1.setMonthlySalary( employee1.getMonthlySalary() * 1.10 );
employee2.setMonthlySalary( employee2.getMonthlySalary() * 1.10 );


System.out.printf( "Employee 1: %s %s; Yearly Salary: %.2f\n",
employee1.getFirstName(), employee1.getLastName(),
12 * employee1.getMonthlySalary() );
System.out.printf( "Employee 2: %s %s; Yearly Salary: %.2f\n",
employee2.getFirstName(), employee2.getLastName(),
12 * employee2.getMonthlySalary() );
}
}