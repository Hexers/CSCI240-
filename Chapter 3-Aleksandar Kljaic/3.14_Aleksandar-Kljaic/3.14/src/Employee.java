public class Employee
{
private String firstName;
private String lastName;
private double monthlySalary;
public Employee( String first, String last, double salary )
{
firstName = first;
lastName = last;
if ( salary >= 0.0 )
monthlySalary = salary;
}
public void setFirstName( String first )
{
firstName = first;
}
public String getFirstName()
{
return firstName;
}
public void setLastName( String last )
{
lastName = last;
}
public String getLastName()
{
return lastName;
}
public void setMonthlySalary( double salary )
{
if ( salary >= 0.0 )
monthlySalary = salary;
}
public double getMonthlySalary()
{
return monthlySalary;
}
}
