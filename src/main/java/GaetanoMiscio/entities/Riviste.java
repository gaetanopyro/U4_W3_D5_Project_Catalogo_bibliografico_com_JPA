package GaetanoMiscio.entities;

import GaetanoMiscio.enums.Periodicità;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("riviste")

public class Riviste extends Documento {
    @Enumerated(EnumType.STRING)
    private Periodicità periodicità;

    public Riviste() {
    }

    public Riviste(String titolo, LocalDate annoPubblicazione, int numeroPagine, Periodicità periodicità) {
        super(titolo, annoPubblicazione, numeroPagine);
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
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
