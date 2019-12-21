// Exercise 10.9 - Cube.java
// Aleksandar Kljaic - November 10, 2014

public class Cube extends ThreeDimensionalShape 
{
   // three-argument constructor
   public Cube( int x, int y, int side )
   {
      super( x, y, side, side, side );
   } // end three-argument Cube constructor

   // overridden methods
   public String getName()
   {
      return "Cube";
   } // end method getName

   public int getArea()
   {
      return ( int ) ( 6 * getSide() * getSide() );
   } // end method getArea

   public int getVolume()
   {
      return ( int ) ( getSide() * getSide() * getSide() );
   } // end method getVolume

   // set method
   public void setSide( int side )
   {
      setDimension1( side );
      setDimension2( side );
      setDimension3( side );
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
} // end class Cube