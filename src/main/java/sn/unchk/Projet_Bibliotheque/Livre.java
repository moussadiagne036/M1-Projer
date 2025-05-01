package sn.unchk.Projet_Bibliotheque;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "livre")
public class Livre {
    @XmlElement(name = "id")
    private Long id;
    @XmlElement(name = "titre")
    private String titre;
    @XmlElement(name = "auteur")
    private String auteur;
    @XmlElement(name = "isbn")
    private String isbn;
    @XmlElement(name = "disponible")
    private boolean disponible;

    public Livre(long l, String s, String seydouBadian, String string, boolean b) {
        super();
    }
    public Livre(String titre, String auteur, String isbn, boolean disponible) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = disponible;

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", isbn='" + isbn + '\'' +
                ", disponible=" + disponible +
                '}';
    }

    public boolean getDisponible() {
        return disponible;
    }
}

