
package serie4.gestionparck;

public class Voiture extends Vehicule{
    
    private int nombrePortes;
    public Voiture(String marque, String model, String immatriculation, int nombrePortes) {
        super(marque, model, immatriculation);
        this.nombrePortes = nombrePortes;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }

    
}
