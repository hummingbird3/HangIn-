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
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class MapGridPanel extends JPanel{
   //properties
   private MapGrid canvas;
   private MouseListener myMouseListener;
   private int clickedRow;
   private int clickedCol;
   
   
   
   //constructors
   MapGridPanel(){
      super();
      
      clickedRow = -1;
      clickedCol = -1;
      canvas = new MapGrid(3);
      myMouseListener = new MyMouseListener();
      canvas.addMouseListener(myMouseListener);
      
      add(canvas);
   }
   
   //methods
   public static void main(String[] args){
      
        MapGridPanel mapGridPanel = new MapGridPanel();
        
      JFrame frame = new JFrame();
      
      
      frame.add(mapGridPanel);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
      
    }
   /**
    * getClickedRow method returns the last pressed row
    * @return clickedRow
    */
   public int getClickedRow(){
    return clickedRow;
}
   /**
    * getClickedCol method returns the last pressed col
    * @return clickedCol
    */
   public int getClickedCol(){
    return clickedCol;
}
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
               clickedRow = row;
               clickedCol = column;
               System.out.println("kek. (row,col) "+ clickedRow + "," + clickedCol + "\n(x,y): " + e.getX() + "," + e.getY());
            }
         }
         canvas.showOnMap(e.getX()- 12 , e.getY() - 12);
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
