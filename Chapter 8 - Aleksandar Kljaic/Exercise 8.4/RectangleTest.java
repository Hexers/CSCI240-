// Exercise 8.4 - Aleksandar Kljaic
// RectangleTest.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RectangleTest extends JApplet
          implements ActionListener {
   private JLabel prompt1, prompt2;
   private JTextField input1, input2;
   private Rectangle r;

   public void init()
   {
      prompt1 = new JLabel( "Length:" );
      prompt2 = new JLabel( "Width:" );
      input1 = new JTextField( 10 );
      input2 = new JTextField( 10 );
      input2.addActionListener( this );
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );
      c.add( prompt1 );
      c.add( input1 );
      c.add( prompt2 );
      c.add( input2 );
      r = new Rectangle();
   }

   public void paint( Graphics g )
   {
      g.drawString( "Length = " + r.getLength(), 25, 75 );
      g.drawString( "Width = " + r.getWidth(), 25, 90 );
      g.drawString( "Perimeter = " + r.perimeter(), 25, 105 );
      g.drawString( "Area = " + r.area(), 25, 120 );
   }

   public void actionPerformed( ActionEvent e )
   {
      double d1, d2;

      d1 = Double.parseDouble( input1.getText() );
      d2 = Double.parseDouble( input2.getText() );

      r.setLength( d1 );
      r.setWidth( d2 );
      repaint();
   }
}