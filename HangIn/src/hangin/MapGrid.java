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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class MapGrid extends JPanel {

    //properties
    private BufferedImage image;
    private final int MAINCAMPUS    = 0;
    private final int ODEON         = 1;
    private final int EASTCAMPUS    = 2;
    private final int BILKENTCENTER = 3;
    private final Dimension dimension;
    private final int BORDER_WIDTH;
    private final int BORDER_HEIGHT;
    private final int UNIT_WIDTH;
    private final int UNIT_HEIGHT;
    private final int ROW;
    private final int COLUMN;
    private boolean showOnMapMode;
    private int targetX;
    private int targetY;

    //constructors
    MapGrid(int sector) {
        super();
try {          
        if(sector == MAINCAMPUS){
          image = ImageIO.read(new File("res/maincampus.png"));
        }else if(sector == ODEON){
          image = ImageIO.read(new File("res/odeon.png"));
        }else if(sector == EASTCAMPUS){
          image = ImageIO.read(new File("res/eastcampus.png"));
        }else if(sector == BILKENTCENTER){
          image = ImageIO.read(new File("res/bilkentcenter.png"));
        }else
          image = ImageIO.read(new File("res/maincampus.png"));
          
        //ALL IMAGES ARE 450x700.
        
       } catch (IOException ex) {
            // handle exception...
            System.out.println("couldn't found that img.");
       }
        BORDER_HEIGHT = image.getHeight();
        BORDER_WIDTH = image.getWidth();
        this.dimension = new Dimension (image.getWidth(), image.getHeight());
        this.COLUMN = (int) dimension.getWidth();
        this.ROW = (int)dimension.getHeight();
        UNIT_HEIGHT = 10; // dimension;
        UNIT_WIDTH = 10; // dimension;
        showOnMapMode = false;
        targetX = 0;
        targetY = 0;

        setPreferredSize(new Dimension( image.getWidth() + 1, image.getHeight() + 1 ));
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
        /**
        g.drawRect(0, 0, BORDER_WIDTH, BORDER_HEIGHT);
        for (int i = 0; i < COLUMN; i++) {
            for (int j = 0; j < ROW; j++) {
                g.drawRect(i * UNIT_WIDTH, j * UNIT_HEIGHT, UNIT_WIDTH, UNIT_HEIGHT);
                //g.drawString("",(UNIT_WIDTH / 2) + (i * UNIT_WIDTH), ((UNIT_HEIGHT / 2) + (j * UNIT_HEIGHT)));
            }
        }
        */
        
        if(showOnMapMode){
            g.setColor(Color.MAGENTA);
            g.fillOval(targetX, targetY, 25, 25);
            g.drawString("here!", targetX - 5, targetY - 5);
            
        }
        
        
    }
    public void showOnMap(int x, int y){
        showOnMapMode = true;
        targetX = x;
        targetY = y;
        repaint();
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
    
}
