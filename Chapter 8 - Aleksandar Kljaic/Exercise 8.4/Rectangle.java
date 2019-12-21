// Exercise 8.4 - Aleksandar Kljaic
// Rectangle.java

public class Rectangle {
   private double length, width;

   public Rectangle()  { this( 1.0, 1.0 ); }

   public Rectangle( double l, double w )
   {
      setLength( l );
      setWidth( w );
   }

   public void setLength( double len )
   { length = ( len >= 0.0 && len <= 20.0 ? len : 1.0 ); }

   public void setWidth( double w )
   { width = ( w >= 0 && w <= 20.0 ? w : 1.0 ); }

   public double getLength() { return length; }

   public double getWidth() { return width; }

   public double perimeter() { return 2 * length + 2 * width; }

   public double area() { return length * width; }
}
