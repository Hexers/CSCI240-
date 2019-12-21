// Exercise 8.16 - Aleksandar Kljaic
// HugeInteger.java

public class HugeInteger
{
	private final int DIGITS = 40;
	private int[] integer; // array containing the integer
	private boolean positive; // whether the integer is positive
	// no-argument constructor
	public HugeInteger()
	{
		integer = new int[ DIGITS ];
		positive = true;
	} // end HugeInteger no-argument constructor

	// convert a String to HugeInteger
	public void input( String inputString )
	{
		char[] integerChar = inputString.toCharArray();
		// check if input is a negative number
		if ( integerChar[ 0 ] == '-' )
			positive = false;
		if ( positive )
			integer[ DIGITS - integerChar.length ] =
			integerChar[ 0 ] - '0';
		// convert string to integer array
		for ( int i = 1; i < integerChar.length; i++ )
			integer[ DIGITS - integerChar.length + i ] =
			integerChar[ i ] - '0';
	} // end method input
	// add two HugeIntegers
	public HugeInteger add( HugeInteger addValue )
	{
		HugeInteger temp = new HugeInteger(); // temporary result
		// both HugeInteger are positive or negative
		if ( positive == addValue.positive )
			temp = addPositives( addValue );
		// addValue is negative
		else if ( positive && ( !addValue.positive ) )
		{
			addValue.positive = true;
			if ( isGreaterThan( addValue ) )
				temp = subtractPositives( addValue );
			else
			{
				temp = addValue.subtractPositives( this );
				temp.positive = false;
			} // end else
			addValue.positive = false; // reset sign for addValue
		} // end else if
		// this is negative
		else if ( !positive && addValue.positive )
		{
			addValue.positive = false;
			if ( isGreaterThan( addValue ) )
				temp = addValue.subtractPositives( this );
			else
			{
				temp = subtractPositives( addValue );
				temp.positive = false;
			} // end else
			addValue.positive = true; // reset sign for addValue
		} // end else if
		return temp; // return the sum
	} // end method add
	// add two positive HugeIntegers
	public HugeInteger addPositives( HugeInteger addValue )
	{
		HugeInteger temp = new HugeInteger();
		int carry = 0;
		// iterate through HugeInteger
		for ( int i = 39; i >= 0; i-- )
		{
			temp.integer[ i ] =
					integer[ i ] + addValue.integer[ i ] + carry;
			// determine whether to carry a 1
			if ( temp.integer[ i ] > 9 )
			{
				temp.integer[ i ] %= 10; // reduce to 0-9
				carry = 1;
			} // end if
			else
				carry = 0;
		} // end for
		// if both are negative, set the result to negative
		if ( !positive )
			temp.positive = false;
		return temp;
	} // end method addPositives
	// subtract two HugeIntegers
	public HugeInteger subtract( HugeInteger subtractValue )
	{
		HugeInteger temp = new HugeInteger(); // temporary result
		// subtractValue is negative
		if ( positive && ( !subtractValue.positive ) )
			temp = addPositives( subtractValue );
		// this HugeInteger is negative
		else if ( !positive && subtractValue.positive )
			temp = addPositives( subtractValue );
		// at this point, both HugeIntegers have the same sign
		else
		{
			boolean isPositive = positive; // original sign
			boolean resultPositive = positive; // sign of the result
			// set both to positive so we can compare absolute values
			positive = true;
			subtractValue.positive = true;
			if ( this.isGreaterThan( subtractValue ) )
				temp = this.subtractPositives( subtractValue );
			else
			{
				temp = subtractValue.subtractPositives( this );
				resultPositive = !isPositive; // flip the sign
			} // end else
			positive = isPositive;
			subtractValue.positive = isPositive;
			temp.positive = resultPositive;
		} // end else
		return temp;
	} // end method subtract
	// subtract two positive HugeIntegers
	public HugeInteger subtractPositives( HugeInteger subtractValue )
	{
		HugeInteger temp = new HugeInteger();
		// iterate through HugeInteger
		for ( int i = 39; i >= 0; i-- )
		{
			// borrow if needed
			if ( integer[i] < subtractValue.integer[i] )
			{
				integer[ i ] += 10;
				subtractValue.integer[ i - 1 ]--;
			} // end if
			temp.integer[ i ] = integer[ i ] - subtractValue.integer[ i ];
		} // end for
		return temp; // return difference of two HugeIntegers
	} // end method subtractPositives
	// find first non-zero position of two HugeIntegers
	public int findFirstNonZeroPosition()
	{
		int position = 39;
		// find first non-zero position for first HugeInteger
		for ( int i = 0; i < DIGITS; i++ )
		{
			if ( integer[ i ] > 0 )
				return i;
		} // end for
		return 39;
	} // end method findFirstNonZeroPosition
	// get string representation of HugeInteger
	public String toString()
	{
		String output = "";
		if ( !positive )
			output = "-";
		// get HugeInteger values without leading zeros
		for ( int i = findFirstNonZeroPosition(); i < DIGITS; i++ )
			output += integer[ i ];
		return output;
	} // end method toHugeIntegerString
	// test if two HugeIntegers are equal
	public boolean isEqualTo( HugeInteger compareValue )
	{
		// compare the sign
		if ( positive != compareValue.positive )
			return false;
		// compare each digit
		for ( int i = 0; i < DIGITS; i++ )
		{
			if ( integer[ i ] != compareValue.integer[ i ] )
				return false;
		} // end for
		return true;
	} // end method isEqualTo
	// test if two HugeIntegers are not equal
	public boolean isNotEqualTo( HugeInteger compareValue )
	{
		return !isEqualTo( compareValue );
	} // end method isNotEqualTo
	// test if one HugeInteger is greater than another
	public boolean isGreaterThan( HugeInteger compareValue )
	{
		// different signs
		if ( positive && ( !compareValue.positive ) )
			return true;
		else if ( !positive && compareValue.positive )
			return false;
		// same sign
		else
		{
			// first number's length is less than second number's length
			if ( findFirstNonZeroPosition() >
			compareValue.findFirstNonZeroPosition() )
			{
				return !positive;
			} // end if
			// first number's length is larger than that of second number
			else if ( findFirstNonZeroPosition() <
					compareValue.findFirstNonZeroPosition() )
			{
				return positive;
			} // end else if
			// two numbers have same length
			else
			{
				for ( int i = 0; i < DIGITS; i++ )
				{
					if ( integer[ i ] > compareValue.integer[ i ] )
						return positive;
					else if ( integer[ i ] < compareValue.integer[ i ] )
						return !positive;
				} // end for
			} // end else
		} // end outer if-elseif-else
		return false;
	} // end method isGreatThan
	// test if one HugeInteger is less than another
	public boolean isLessThan( HugeInteger compareValue )
	{
		return !( isGreaterThan( compareValue ) ||
				isEqualTo( compareValue ) );
	} // end method isLessThan
	// test if one HugeInteger is great than or equal to another
	public boolean isGreaterThanOrEqualTo( HugeInteger compareValue )
	{
		return !isLessThan( compareValue );
	} // end method isGreaterThanOrEqualTo
	// test if one HugeInteger is less than or equal to another
	public boolean isLessThanOrEqualTo( HugeInteger compareValue )
	{
		return !isGreaterThan( compareValue );
	} // end method isLessThanOrEqualTo
	// test if one HugeInteger is zero
	public boolean isZero()
	{
		// compare each digit
		for ( int i = 0; i < DIGITS; i++ )
		{
			if ( integer[ i ] != 0 )
				return false;
		} // end for
		return true;
	} // end method isZero
} // end class HugeInteger