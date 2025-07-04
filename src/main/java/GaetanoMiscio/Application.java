package GaetanoMiscio;

import GaetanoMiscio.DAO.DocumentoDAO;
import GaetanoMiscio.DAO.PrestitoDAO;
import GaetanoMiscio.DAO.UtenteDAO;
import GaetanoMiscio.entities.Libri;
import GaetanoMiscio.entities.Prestito;
import GaetanoMiscio.entities.Riviste;
import GaetanoMiscio.entities.Utente;
import GaetanoMiscio.enums.Genere;
import GaetanoMiscio.enums.Periodicità;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4_W3_D5PU");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        DocumentoDAO dt = new DocumentoDAO(em);
        UtenteDAO ut = new UtenteDAO(em);
        PrestitoDAO pt = new PrestitoDAO(em);

        Libri libro1 = new Libri("Il Signore degli Anelli", LocalDate.of(1954, 7, 29), 1200, "J.R.R. Tolkien", Genere.FANTASY);
        Libri libro2 = new Libri("1984", LocalDate.of(1949, 6, 8), 328, "George Orwell", Genere.AVVENTURA);
        Libri libro3 = new Libri("Cent'anni di solitudine", LocalDate.of(1967, 5, 30), 417, "Gabriel García Márquez", Genere.FANTASCIENZA);

        Riviste rivista1 = new Riviste("National Geographic", LocalDate.of(2025, 1, 1), 100, Periodicità.MENSILE);
        Riviste rivista2 = new Riviste("Focus", LocalDate.of(2025, 6, 1), 80, Periodicità.SETTIMANALE);

        dt.save(libro1);
        dt.save(libro2);
        dt.save(libro3);
        dt.save(rivista1);
        dt.save(rivista2);
        System.out.println("Documenti Libri e Riviste aggiunti.");

        Utente utente1 = new Utente("Mario", "Rossi", LocalDate.of(1990, 5, 15), 12345);
        Utente utente2 = new Utente("Laura", "Bianchi", LocalDate.of(1985, 10, 20), 67890);
        Utente utente3 = new Utente("Giuseppe", "Verdi", LocalDate.of(1992, 3, 8), 11223);

        ut.save(utente1);
        ut.save(utente2);
        ut.save(utente3);
        System.out.println("Utenti aggiunti.");

        Prestito prestito1 = new Prestito(utente1, rivista1, LocalDate.of(2025, 8, 12), LocalDate.of(2025, 9, 12));
        Prestito prestito2 = new Prestito(utente2, rivista2, LocalDate.of(2025, 3, 10), LocalDate.of(2025, 4, 10));
        // Prestito prestito3 = new Prestito(utente3, libro1, LocalDate.of(2025, 2, 15),LocalDate.of(2025, 3, 15));

        pt.save(prestito1);
        pt.save(prestito2);
        // pt.save(prestito3);


        em.close();
        emf.close();
    }
}
