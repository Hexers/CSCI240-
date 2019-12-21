// Exercise 10.9 - Square.java
// Aleksandar Kljaic - November 10, 2014

public class Square extends TwoDimensionalShape 
{
   // three-argument constructor
   public Square( int x, int y, int side )
   {
      super( x, y, side, side );
   } // end three-argument Square constructor

   // overridden methods
   public String getName()
   {
      return "Square";
   } // end method getName

   public int getArea()
   {
      return getSide() * getSide();
   } // end method getArea

   // set method
   public void setSide( int side )
   {
      setDimension1( side );
      setDimension2( side );
   } // end method setSide

   // get method
   public int getSide()
   {
      return getDimension1();
   } // end method getSide
   
   public String toString()
   {
      return String.format( "%s %s: %d\n", 
         super.toString(), "side", getSide() );
   } // end method toString
} // end class Square