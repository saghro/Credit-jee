
package serie4.exinterface;

public class ExInterface {

    public static void main(String[] args) {
       Point point = new Point(1, 2);
       Cercle cercle = new Cercle(point, 3);
       Carre carre = new Carre(new Point(2, 3),4);
       Rectangle rec = new Rectangle(point, 3, 4);
       Form [] formes = new Form[3];
       formes[0] = cercle;
       formes[1] = carre;
       formes[2] = rec;
       for(Form f:formes){
           System.out.println(f.calculSurface());
       }
    }
}
