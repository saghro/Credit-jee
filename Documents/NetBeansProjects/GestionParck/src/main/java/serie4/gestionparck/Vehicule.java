
package serie4.gestionparck;

public abstract class Vehicule {
    protected String marque;
    protected String model;
    protected String immatriculation ;

    public Vehicule(String marque, String model, String immatriculation) {
        this.marque = marque;
        this.model = model;
        this.immatriculation = immatriculation;
    }
    
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
    
}
