package ud4.practices.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Grup {
    private final String nom;
    private final LocalDate dataFundacio;
    private final String pais;
    private final List<Artista> artistes;

    public Grup(String nom, LocalDate dataFundacio, String pais) {
        this.nom = nom;
        this.dataFundacio = dataFundacio;
        this.pais = pais;
        this.artistes = new ArrayList<>();
    }
    public Grup(String nom, String dataFundacio, String pais) {
        this(nom, LocalDate.parse(dataFundacio, DateTimeFormatter.ofPattern("yyyy-MM-dd")), pais);
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDataFundacio() {
        return dataFundacio;
    }

    public String getPais() {
        return pais;
    }

    public List<Artista> getArtistes() {
        return artistes;
    }

    public boolean addArtista(Artista artista){
        if (artistes.contains(artista))
            return false;
        artistes.add(artista);
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", nom, dataFundacio.getYear());
    }
}
