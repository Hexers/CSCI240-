// Exercise 10.9 - Circle.java
// Aleksandar Kljaic - November 10, 2014

public class Circle extends TwoDimensionalShape 
{
   // three-argument constructor
   public Circle( int x, int y, int radius )
   {
      super( x, y, radius, radius );
   } // end three-argument Circle constructor

   // overridden methods
   public String getName()
   {
      return "Circle";
   } // end method getName

   public int getArea()
   {
      return ( int ) 
         ( Math.PI * getRadius() * getRadius() );
   } // end method getArea

   // set method
   public void setRadius( int radius )
   {
      setDimension1( radius );
      setDimension2( radius );
   } // end method setRadius

   // get method
   public int getRadius()
   {
      return getDimension1();
   } // end method getRadius
   
   public String toString()
   {
      return String.format( "%s %s: %d\n", 
         super.toString(), "radius", getRadius() );
   } // end method toString
} // end class Circle