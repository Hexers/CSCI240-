// Exercise 11.17 - ExceptionB.java
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

public class ExceptionB extends ExceptionA {

	public ExceptionB() {

	}//end constructor

	public ExceptionB(final String exceptionMessage){
		super(exceptionMessage);
	}//end constructor
	
	public void test() throws ExceptionB{
		throw new ExceptionB("An Exception of type 'ExceptionB' has been thrown.");
	}//end method
}//end class