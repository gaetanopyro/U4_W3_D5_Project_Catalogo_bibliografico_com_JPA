package GaetanoMiscio.entities;

import GaetanoMiscio.enums.Genere;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.UUID;


@Entity
@DiscriminatorValue("libri")

public class Libri extends Documento {


    private String autore;
    private Genere genere;

    public Libri() {
    }

    public Libri(UUID codeISBN, String titolo, LocalDate annoPubblicazione, int numeroPagine, String autore, Genere genere) {
        super(codeISBN, titolo, annoPubblicazione, numeroPagine);
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
