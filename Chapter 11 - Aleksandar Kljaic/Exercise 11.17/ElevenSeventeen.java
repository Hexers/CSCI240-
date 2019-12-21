// Exercise 11.17 - ElevenSeventeen.java
// Aleksandar Kljaic - November 11, 2014
// Chapter 11 - Page 468
/*
 * (Catching Exceptions with Superclasses)
 * Use inheritance to create an exception superclass (called ExceptionA) and exception 
 * subclasses ExceptionB and ExceptionC, where ExceptionB inherits from ExceptionA
 * and ExceptionC inherits from ExceptionB. Write a program to demonstrate that the
 * catch block for type ExceptionA catches exceptions of types ExceptionB and ExceptionC.
 * 
 */

public class ElevenSeventeen {
	
	public static void main( String [] args ){
		ExceptionB b = new ExceptionB();
		ExceptionC c = new ExceptionC();
		try{
			b.test(); // throw ExceptionB
		} // ends try
		catch( ExceptionA e ){ // catch with ExceptionA
			e.printStackTrace( System.err );
		} // ends catch
		try {
			c.test(); // throw ExceptionC
		} // ends try
		catch( ExceptionA e ){ // catch it with ExceptionA
			e.printStackTrace( System.err );
		} // ends catch
	} // ends main
}//end class