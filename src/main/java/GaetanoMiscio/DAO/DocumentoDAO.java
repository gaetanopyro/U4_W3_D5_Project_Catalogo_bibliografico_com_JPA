package GaetanoMiscio.DAO;

import GaetanoMiscio.entities.Documento;
import GaetanoMiscio.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

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

    public Documento findById(String documentoId) {
        Documento found = entityManager.find(Documento.class, UUID.fromString(documentoId));
        if (found == null) throw new NotFoundException(documentoId);
        return found;
    }


}