package GaetanoMiscio.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "prestiti")
/*
@NamedQuery(name = "Prestito.findActiveLoansByUserCardNumber",
        query = "SELECT p FROM Prestito p WHERE p.utente.numeroDiTessera = :numeroTessera AND p.dataRestituzioneEffettiva IS NULL")
@NamedQuery(name = "Prestito.findOverdueLoans",
        query = "SELECT p FROM Prestito p WHERE p.dataRestituzionePrevisto < CURRENT_DATE AND p.dataRestituzioneEffettiva IS NULL")
*/
public class Prestito {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "utente")

    private Utente utente;
    @ManyToOne
    @JoinColumn(name = "documento_prestato_id")
    private Documento elementoPrestato;
    private LocalDate dataInizioPrestito;
    private LocalDate dataRestituzionePrevisto;
    private LocalDate dataRestituzioneEffetiva;

    public Prestito(Utente utente2, Riviste rivista2, LocalDate localDate, LocalDate date) {
    }

    public Prestito(Utente utente, Documento elementoPrestato, LocalDate dataInizioPrestito, LocalDate dataRestituzionePrevisto, LocalDate dataRestituzioneEffetiva) {
        this.utente = utente;
        this.elementoPrestato = elementoPrestato;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevisto = dataRestituzionePrevisto.plusDays(30);
        this.dataRestituzioneEffetiva = dataRestituzioneEffetiva;
    }

    public UUID getId() {
        return id;
    }


    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Documento getElementoPrestato() {
        return elementoPrestato;
    }

    public void setElementoPrestato(Documento elementoPrestato) {
        this.elementoPrestato = elementoPrestato;
    }

    public LocalDate getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public LocalDate getDataRestituzionePrevisto() {
        return dataRestituzionePrevisto;
    }

    public void setDataRestituzionePrevisto(LocalDate dataRestituzionePrevisto) {
        this.dataRestituzionePrevisto = dataRestituzionePrevisto;
    }

    public LocalDate getDataRestituzioneEffetiva() {
        return dataRestituzioneEffetiva;
    }

    public void setDataRestituzioneEffetiva(LocalDate dataRestituzioneEffetiva) {
        this.dataRestituzioneEffetiva = dataRestituzioneEffetiva;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "id=" + id +
                ", utente=" + utente +
                ", elementoPrestato=" + elementoPrestato +
                ", dataInizioPrestito=" + dataInizioPrestito +
                ", dataRestituzionePrevisto=" + dataRestituzionePrevisto +
                ", dataRestituzioneEffetiva=" + dataRestituzioneEffetiva +
                '}';
    }
}
