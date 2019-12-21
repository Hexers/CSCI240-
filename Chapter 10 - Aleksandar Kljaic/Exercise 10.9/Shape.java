// Exercise 10.9 - Shape.java
// Aleksandar Kljaic - November 10, 2014

public abstract class Shape 
{
   private int x; // x coordinate
   private int y; // y coordinate

   // two-argument constructor
   public Shape( int x, int y )
   {
      this.x = x;
      this.y = y;
   } // end two-argument Shape constructor

   // set x coordinate
   public void setX( int x )
   {
      this.x = x;
   } // end method setX

   // set y coordinate
   public void setY( int y )
   {
      this.y = y;
   } // end method setY

   // get x coordinate
   public int getX()
   {
      return x;
   } // end method getX

   // get y coordinate
   public int getY()
   {
      return y;
   } // end method getY

   // return String representation of Shape object
   public String toString()
   {
      return String.format( "[%d, %d]", getX(), getY() );
   }

   // abstract methods
   public abstract String getName();
} // end class Shape