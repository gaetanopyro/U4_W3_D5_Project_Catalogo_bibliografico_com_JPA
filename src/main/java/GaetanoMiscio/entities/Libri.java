package GaetanoMiscio.entities;

import GaetanoMiscio.enums.Genere;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;


@Entity
@DiscriminatorValue("libri")

//@NamedQuery(name = "Libri.findByAutore", query = "SELECT l FROM Libri l WHERE l.autore LIKE :autore")
public class Libri extends Documento {


    private String autore;
    @Enumerated(EnumType.STRING)
    private Genere genere;

    public Libri() {
    }

    public Libri(String titolo, LocalDate annoPubblicazione, int numeroPagine, String autore, Genere genere) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }


    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "genere=" + genere +
                ", codeISBN=" + codeISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                ", autore='" + autore + '\'' +
                '}';
    }
}
