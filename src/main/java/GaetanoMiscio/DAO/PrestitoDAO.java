package GaetanoMiscio.DAO;

import GaetanoMiscio.entities.Prestito;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PrestitoDAO {
    private final EntityManager entityManager;

    public PrestitoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Prestito newPrestito) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newPrestito);
        transaction.commit();
        System.out.println("Il prestito " + newPrestito.getId() + " è stato creato correttamente!");
    }

}
