
package serie4.exinterface;

public class Cercle extends Form implements Translation{
    Point centre ;
    double rayon;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    
     @Override
    public double calculSurface() {
       return Math.PI * rayon * rayon;
    }

    @Override
    public void transler(int dx , int dy){
        centre.setX(centre.getX()+dx) ;
        centre.setY(centre.getY()+dy) ;
        
    }
    
}
