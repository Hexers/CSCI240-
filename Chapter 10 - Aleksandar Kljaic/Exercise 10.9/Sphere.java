// Exercise 10.9 - Sphere.java
// Aleksandar Kljaic - November 10, 2014

public class Sphere extends ThreeDimensionalShape
{
   // three-argument constructor
   public Sphere( int x, int y, int radius )
   {
      super( x, y, radius, radius, radius );
   } // end three-argument Shape constructor

   // overridden methods
   public String getName()
   {
      return "Sphere";
   } // end method getName

   public int getArea()
   {
      return ( int ) ( 4 * Math.PI * getRadius() * getRadius() );
   } // end method getArea

   public int getVolume()
   {
      return ( int ) ( 4.0 / 3.0 * Math.PI * 
         getRadius() * getRadius() * getRadius() );
   } // end method getVolume

   // set method
   public void setRadius( int radius )
   {
      setDimension1( radius );
      setDimension2( radius );
      setDimension3( radius );
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
} // end class Sphere