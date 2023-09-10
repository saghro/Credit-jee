
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
       @Override
    public String toString() { 
        String affichage ;
        if(isRemoque())
           affichage = " La camoin " +getMarque() +" " +getModel() +  "d'immatriculation " + getImmatriculation()
                +"contient un remoque";
        else
            affichage = " La camoin " +getMarque() +" " +getModel() +  "d'immatriculation " + getImmatriculation()+
                " ne contient pas un remoque ";
        return affichage;
} 
}
