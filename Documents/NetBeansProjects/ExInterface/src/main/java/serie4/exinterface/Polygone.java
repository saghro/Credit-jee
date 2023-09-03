
package serie4.exinterface;

public abstract class Polygone extends Form {
    protected  int nbrcote;

    public int getNbrcote() {
        return nbrcote;
    }

    public void setNbrcote(int nbrcote) {
        this.nbrcote = nbrcote;
    }
    protected  String afficherTypePolygone(){
        String type = "type inconnu";
        switch (nbrcote) {
            case 3:
                type="Triangle";
                break;
            case 4:
                type = "Quadrilatere";
                break;
            case 5:
                type = "Pentagone";
                break;
            case 6:
                type = "Hexagone";
                break;
            default:
                break;
        }
        return type;
    }
}
