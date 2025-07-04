package GaetanoMiscio;

import GaetanoMiscio.DAO.DocumentoDAO;
import GaetanoMiscio.DAO.PrestitoDAO;
import GaetanoMiscio.DAO.UtenteDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4_W3_D5PU");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        DocumentoDAO dt = new DocumentoDAO(em);
        UtenteDAO ut = new UtenteDAO(em);
        PrestitoDAO pt = new PrestitoDAO(em);

    }
}
