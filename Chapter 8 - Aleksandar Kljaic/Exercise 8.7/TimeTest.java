// Exercise 8.7 - Aleksandar Kljaic
// TimeTest.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TimeTest extends JApplet
            implements ActionListener {
   private Time3 t;
   private JLabel hrLabel, minLabel, secLabel;
   private JTextField hrField, minField, secField, display;
   private JButton tickButton;

   public void init()
   {
      t = new Time3();

      hrLabel = new JLabel( "Set Hour" );
      hrField = new JTextField( 10 );
      hrField.addActionListener( this );
      minLabel = new JLabel( "Set Minute" );
      minField = new JTextField( 10 );
      minField.addActionListener( this );
      secLabel = new JLabel( "Set Second" );
      secField = new JTextField( 10 );
      secField.addActionListener( this );
      display = new JTextField( 30 );
      display.setEditable( false );
      tickButton = new JButton( "Add 1 to Second" );
      tickButton.addActionListener( this );
       
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );
      c.add( hrLabel );
      c.add( hrField );
      c.add( minLabel );
      c.add( minField );
      c.add( secLabel );
      c.add( secField );
      c.add( display );
      c.add( tickButton );
      updateDisplay();      
   }

   public void actionPerformed( ActionEvent e )
   {
      if ( e.getSource() == tickButton )
         t.tick();
      else if ( e.getSource() == hrField ) {
         t.setHour( Integer.parseInt( e.getActionCommand().toString() ) );
         hrField.setText( "" );
      }
      else if ( e.getSource() == minField ) {
         t.setMinute( Integer.parseInt( e.getActionCommand().toString() ) );
         minField.setText( "" );
      }
      else if ( e.getSource() == secField ) {
         t.setSecond( Integer.parseInt( e.getActionCommand().toString() ) );
         secField.setText( "" );
      }

      updateDisplay();
   }

   public void updateDisplay()
   {
      display.setText( "Hour: " + t.getHour() +
         "; Minute: " + t.getMinute() +
         "; Second: " + t.getSecond() );
      showStatus( "Standard time is: " + t.toString()+
         "; Military time is: " + t.toMilitaryString() );
   }
}