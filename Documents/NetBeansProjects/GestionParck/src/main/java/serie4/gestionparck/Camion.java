
package serie4.gestionparck;


public class Camion extends Vehicule {
     private boolean remoque;
    public Camion(String marque, String model, String immatriculation, boolean remoque) {
        super(marque, model, immatriculation);
        this.remoque = remoque;
    }

    public boolean isRemoque() {
        return remoque;
    }

    public void setRemoque(boolean remoque) {
        this.remoque = remoque;
    }
    
}
