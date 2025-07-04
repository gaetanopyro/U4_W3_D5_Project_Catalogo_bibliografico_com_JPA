package GaetanoMiscio.entities;

import GaetanoMiscio.enums.Periodicità;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@DiscriminatorValue("riviste")

public class Riviste extends Documento {
    private Periodicità periodicità;

    public Riviste() {
    }

    public Riviste(UUID codeISBN, String titolo, LocalDate annoPubblicazione, int numeroPagine, Periodicità periodicità) {
        super(codeISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicità = periodicità;
    }


    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodicità=" + periodicità +
                ", codeISBN=" + codeISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPublicazione=" + annoPublicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
