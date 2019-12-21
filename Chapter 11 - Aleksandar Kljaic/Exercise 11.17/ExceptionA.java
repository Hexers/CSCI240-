// Exercise 11.17 - ExceptionA.java
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

public abstract class ExceptionA extends Exception{
	public ExceptionA(){
		// deliberately empty
	}

	public ExceptionA(final String exceptionMessage ){
		super( exceptionMessage );
	}

	// abstract method, must be declared in all subclasses.
	public abstract void test() throws ExceptionA;
}//end method