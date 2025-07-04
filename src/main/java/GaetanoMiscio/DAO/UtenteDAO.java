package GaetanoMiscio.DAO;

import GaetanoMiscio.entities.Utente;
import GaetanoMiscio.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class UtenteDAO {
    private final EntityManager entityManager;

    public UtenteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Utente newUtente) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newUtente);
        transaction.commit();
        System.out.println("L'utente " + newUtente.getNome() + " è stata create correttamente!");
    }

    public Utente findById(String utenteId) {
        Utente found = entityManager.find(Utente.class, UUID.fromString(utenteId));
        if (found == null) throw new NotFoundException(utenteId);
        return found;

    }
}
