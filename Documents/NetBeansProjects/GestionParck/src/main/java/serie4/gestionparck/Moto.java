
package serie4.gestionparck;


public class Moto extends Vehicule{
    
    private int vitesseMax;
    public Moto(String marque, String model, String immatriculation, int vitesseMax) {
        super(marque, model, immatriculation);
        this.vitesseMax = vitesseMax;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }
       @Override
    public String toString() {
        String affichage = " Le Moto " +getMarque() +" " +getModel() +  "d'immatriculation " + getImmatriculation()+
                " a une vetisse maximale "+getVitesseMax();
        return affichage;
}
}
