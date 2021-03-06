package Shape;

import java.awt.*;

/**
 * Class qui permet de dessiner un carré ou un Rectangle
 * Created by gui_h on 2016-05-06.
 */
public class Rectangle extends Forme {
    private Point p1,p2;
    private boolean isSquare;

    /***
     * Constructeur de la classe
     * @param p1 les coordonnées du premier point
     * @param p2 les coordonnées du deuxième point
     * @param square Boolean en fonction de si c'est un carré
     */
    public Rectangle(Point p1, Point p2, boolean square){
        this.p1 = p1;
        this.p2 = p2;
        this.isSquare = square;
    }

    /***
     * Dessine la forme en fonction des paramètres de la classe
     * @param g Permet de dessiner sur les composants
     */
    @Override
    public void paint(Graphics g) {
        int width = p2.x - p1.x;
        int height = p2.y - p1.y;
        if(isSquare) {
            g.setColor(Color.red);
        }
        else{
            g.setColor(Color.blue);
        }
        g.fillRect (p1.x,p1.y,width,height);
    }
}
