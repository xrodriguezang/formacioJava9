package cat.formacio.java9.producte;

public class Producte {

    private String nom = "Producte";
    private double importe = 50;

    public double getImportDescompte () {
        return Descompte.cincuantaPerCent(importe);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

}
