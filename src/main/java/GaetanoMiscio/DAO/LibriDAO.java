package GaetanoMiscio.DAO;

import GaetanoMiscio.entities.Documento;
import GaetanoMiscio.entities.Libri;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;


public class LibriDAO {
    private final EntityManager entityManager;

    public LibriDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Libri newLibri) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newLibri);
        transaction.commit();
        System.out.println("I libri " + newLibri. () + " sono stati creati correttamente!");
    }

}

