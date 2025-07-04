package GaetanoMiscio.DAO;

import GaetanoMiscio.entities.Riviste;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class RivisteDAO {
    private final EntityManager entityManager;

    public RivisteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Riviste newRiviste) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newRiviste);
        transaction.commit();
        System.out.println("le riviste " + newRiviste. () + " sono state create correttamente!");
    }

}
