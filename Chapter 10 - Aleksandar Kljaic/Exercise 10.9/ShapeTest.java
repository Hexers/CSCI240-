// Exercise 10.9 - ShapeTest.java
// Aleksandar Kljaic - November 10, 2014

public class ShapeTest 
{
   // create Shape objects and display their information
   public static void main( String args[] )
   {
      Shape shapes[] = new Shape[ 4 ];
      shapes[ 0 ] = new Circle( 22, 88, 4 );
      shapes[ 1 ] = new Square( 71, 96, 10 );
      shapes[ 2 ] = new Sphere( 8, 89, 2 );
      shapes[ 3 ] = new Cube( 79, 61, 8 );

      // call method print on all shapes
      for ( Shape currentShape : shapes ) 
      {
         System.out.printf( "%s: %s", 
            currentShape.getName(), currentShape );
         
         if ( currentShape instanceof TwoDimensionalShape )
         {
            TwoDimensionalShape twoDimensionalShape = 
               ( TwoDimensionalShape ) currentShape;

            System.out.printf( "%s's area is %s\n", 
               currentShape.getName(), twoDimensionalShape.getArea() );
         } // end if
         
         if ( currentShape instanceof ThreeDimensionalShape )
         {
            ThreeDimensionalShape threeDimensionalShape = 
               ( ThreeDimensionalShape ) currentShape;
            
            System.out.printf( "%s's area is %s\n", 
               currentShape.getName(), threeDimensionalShape.getArea() );
            System.out.printf( "%s's volume is %s\n",
               currentShape.getName(), 
               threeDimensionalShape.getVolume() );
         } // end if

         System.out.println();
      } // end for
   } // end main
} // end class ShapeTest