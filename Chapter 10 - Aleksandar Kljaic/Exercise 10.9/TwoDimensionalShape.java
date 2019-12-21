// Exercise 10.9 - TwoDimensionalShape.java
// Aleksandar Kljaic - November 10, 2014

public abstract class TwoDimensionalShape extends Shape 
{
   private int dimension1;
   private int dimension2;

   // four-argument constructor
   public TwoDimensionalShape( int x, int y, int d1, int d2 )
   {
      super( x, y );
      dimension1 = d1;
      dimension2 = d2;
   } // end four-argument TwoDimensionalShape constructor

   // set methods
   public void setDimension1( int d )
   {
      dimension1 = d;
   } // end method setDimension1

   public void setDimension2( int d )
   {
      dimension2 = d;
   } // end method setDimension2

   // get methods
   public int getDimension1()
   {
      return dimension1;
   } // end method getDimension1

   public int getDimension2()
   {
      return dimension2;
   } // end method getDimension2

   // abstract method
   public abstract int getArea();
} // end class TwoDimensionalShape