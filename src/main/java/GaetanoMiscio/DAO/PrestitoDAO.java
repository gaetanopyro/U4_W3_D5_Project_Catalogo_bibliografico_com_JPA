package GaetanoMiscio.DAO;

import GaetanoMiscio.entities.Prestito;
import GaetanoMiscio.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

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

    public Prestito findById(String pretitoId) {
        Prestito found = entityManager.find(Prestito.class, UUID.fromString(pretitoId));
        if (found == null) throw new NotFoundException(pretitoId);
        return found;
    }

}
