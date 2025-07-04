package GaetanoMiscio.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "documento")

public abstract class Documento {
    @Id
    @GeneratedValue
    @Column(name = "codeISBN_id")
    protected UUID codeISBN;
    protected String titolo;
    protected LocalDate annoPubblicazione;
    protected int numeroPagine;


    public Documento() {
    }

    public Documento(UUID codeISBN, String titolo, LocalDate annoPubblicazione, int numeroPagine) {
        this.codeISBN = codeISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPublicazione(LocalDate annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public UUID getCodeISBN() {
        return codeISBN;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "codeISBN=" + codeISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
