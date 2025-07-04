package GaetanoMiscio.DAO;

import GaetanoMiscio.entities.Documento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class DocumentoDAO {
    private final EntityManager entityManager;

    public DocumentoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Documento newDoc) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newDoc);
        transaction.commit();
        System.out.println("Il documento " + newDoc.getTitolo() + " è stato creato correttamente!");
    }

}