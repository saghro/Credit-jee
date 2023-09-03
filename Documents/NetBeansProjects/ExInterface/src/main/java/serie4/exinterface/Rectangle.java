
package serie4.exinterface;
 
public class Rectangle extends Polygone implements Translation{
     Point point1;
     int largeur , hauteur;

    public Rectangle(Point point1, int largeur, int hauteur) {
        this.point1 = point1;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    
    
    @Override
    public double calculSurface() {
         return largeur*hauteur;
    }

      @Override
    public void transler(int dx , int dy){
        point1.setX(point1.getX()+dx) ;
        point1.setY(point1.getY()+dy) ;
        
    }
    
    
}
