package hangin;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author egehatirnaz
 */
import java.awt.event.*;
import javax.swing.JPanel;
import java.awt.Dimension;

public class MapGridPanel extends JPanel{
   //properties
   private MapGrid canvas;
   private MouseListener myMouseListener;
   
   
   
   //constructors
   MapGridPanel(){
      super();
      
      canvas = new MapGrid(40,1,1);
      myMouseListener = new MyMouseListener();
      canvas.addMouseListener(myMouseListener);
      
      add(canvas);
   }
   
   //methods
   
   /**
    * MyMouseListener class
    * @author Ege "Aegis" Hatırnaz
    * implements MouseListener
    */
   public class MyMouseListener implements MouseListener{
      @Override
      public void mouseClicked(MouseEvent e){
         int row;
         int column;
         row = -1;
         column = -1;
         //check canvas
         if(e.getX() < canvas.getBorderWidth()){
            if(e.getY() < canvas.getBorderHeight()){
               //init the row and col
               row = (e.getY() / canvas.getUnitHeight()) + 1;
               column = (e.getX() / canvas.getUnitWidth()) +1;
               //do something
               System.out.println("kek. (row,col) "+ row + "," + column);
            }
         }
         canvas.repaint();
         repaint();
         
      }
      @Override
      public void mouseExited(MouseEvent e){}
      @Override
      public void mouseEntered(MouseEvent e){}
      @Override
      public void mousePressed(MouseEvent e){}
      @Override
      public void mouseReleased(MouseEvent e){}
   }
  
}
