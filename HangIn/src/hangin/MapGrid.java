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
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MapGrid extends JPanel {

    //properties
    private BufferedImage image;
    
    private int dimension;
    private final int BORDER_WIDTH = 401;
    private final int BORDER_HEIGHT = 401;
    private final int UNIT_WIDTH;
    private final int UNIT_HEIGHT;
    private final int ROW;
    private final int COLUMN;

    //constructors
    MapGrid(int dimension, int COLUMN, int ROW) {
        super();
try {                
          image = ImageIO.read(new File("res/maincampus.png"));
       } catch (IOException ex) {
            // handle exception...
            System.out.println("couldn't found that img.");
       }
        this.dimension = dimension;
        this.COLUMN = dimension;
        this.ROW = dimension;
        UNIT_HEIGHT = (BORDER_WIDTH) / dimension;
        UNIT_WIDTH = (BORDER_HEIGHT) / dimension;

        setPreferredSize(new Dimension(BORDER_WIDTH, BORDER_HEIGHT));
        repaint();
    }

    //methods
    /**
     * paintComponent method
     *
     * @param g draws the grid
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(image, 0, 0, this); 
        g.drawRect(0, 0, BORDER_WIDTH, BORDER_HEIGHT);
        for (int i = 0; i < COLUMN; i++) {
            for (int j = 0; j < ROW; j++) {
                g.drawRect(i * UNIT_WIDTH, j * UNIT_HEIGHT, UNIT_WIDTH, UNIT_HEIGHT);
                g.drawString("",(UNIT_WIDTH / 2) + (i * UNIT_WIDTH), ((UNIT_HEIGHT / 2) + (j * UNIT_HEIGHT)));
            }
        }
    }

    /**
     * getColumn method
     *
     * @return COLUMN
     */
    public int getColumn() {
        return COLUMN;
    }

    /**
     * getRow method
     *
     * @return ROW
     */
    public int getRow() {
        return ROW;
    }

    /**
     * getUnitHeight method
     *
     * @return UNIT_HEIGHT
     */
    public int getUnitHeight() {
        return UNIT_HEIGHT;
    }

    /**
     * getUnitWidth method
     *
     * @return UNIT_WIDTH
     */
    public int getUnitWidth() {
        return UNIT_WIDTH;
    }

    /**
     * getBorderHeight method
     *
     * @return BORDER_HEIGHT
     */
    public int getBorderHeight() {
        return BORDER_HEIGHT;
    }

    /**
     * getBorderWidth method
     *
     * @return BORDER_WIDTH
     */
    public int getBorderWidth() {
        return BORDER_WIDTH;
    }
    public static void main(String[] args){
        MapGridPanel mapGridPanel = new MapGridPanel();
        JFrame frame = new JFrame();
        
      frame.add(mapGridPanel);
      frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
    }
}
