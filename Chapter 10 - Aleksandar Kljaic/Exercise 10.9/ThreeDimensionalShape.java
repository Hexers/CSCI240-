// Exercise 10.9 - ThreeDimensionalShape.java
// Aleksandar Kljaic - November 10, 2014

public abstract class ThreeDimensionalShape extends Shape 
{
   private int dimension1;
   private int dimension2;
   private int dimension3;

   // five-argument constructor
   public ThreeDimensionalShape(
      int x, int y, int d1, int d2, int d3 )
   {
      super( x, y );
      dimension1 = d1;
      dimension2 = d2;
      dimension3 = d3;
   } // end five-argument ThreeDimensionalShape constructor

   // set methods
   public void setDimension1( int d )
   {
      dimension1 = d;
   } // end method setDimension1

   public void setDimension2( int d )
   {
      dimension2 = d;
   } // end method setDimension2

   public void setDimension3( int d )
   {
      dimension3 = d;
   } // end method setDimension3

   // get methods
   public int getDimension1() 
   {
      return dimension1;
   } // end method getDimension1

   public int getDimension2()
   {
      return dimension2;
   } // end method getDimension2

   public int getDimension3()
   {
      return dimension3;
   } // end method getDimension3

   // abstract methods
   public abstract int getArea();
   public abstract int getVolume();
} // end class ThreeDimensionalShape