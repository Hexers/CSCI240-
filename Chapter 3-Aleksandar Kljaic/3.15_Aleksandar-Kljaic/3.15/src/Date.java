public class Date
{
private int month;
private int day;
private int year;

public Date( int monthValue, int dayValue, int yearValue )
{
month = monthValue;
day = dayValue;
year = yearValue;
}
public void setMonth( int monthValue )
{
month = monthValue;
}
public int getMonth()
{
return month;
}
public void setDay( int dayValue )
{
day = dayValue;
}
public int getDay()
{
return day;
}
public void setYear( int yearValue )
{
year = yearValue;
}
public int getYear()
{
return year;
} // return year

public void displayDate()
{
System.out.printf( "%d/%d/%d", getMonth(), getDay(), getYear() );
} // end method displayDate
} // end class Date