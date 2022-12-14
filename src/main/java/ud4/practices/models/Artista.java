package ud4.practices.models;

public class Artista {
    private final String nom;
    private final String cognom;
    private final String pais;

    public Artista(String nom, String cognom, String pais) {
        this.nom = nom;
        this.cognom = cognom;
        this.pais = pais;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return String.format("%s %s", nom, cognom);
    }
}
