package dao;

import model.ItemEntity;
import model.NotesType;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional(Transactional.TxType.MANDATORY)
@Dependent
public class ItemDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(ItemEntity itemEntity) {
        entityManager.persist(itemEntity);
        //po zamknietej transakcji zapisze go do bazy
    }

    public List<ItemEntity> findAll() {
        TypedQuery<ItemEntity> query = entityManager.createQuery("SELECT i FROM ItemEntity i", ItemEntity.class);
        return query.getResultList();
    }

    public Optional<ItemEntity> findById(Integer id){
        ItemEntity itemEntity = entityManager.find(ItemEntity.class, id);
        return Optional.ofNullable(itemEntity);

    }
    public void remove (ItemEntity itemEntity){
        entityManager.remove(itemEntity);
    }

    public List<ItemEntity> findByType(NotesType notesType) {
        TypedQuery<ItemEntity> typedQuery = entityManager.createQuery("SELECT i FROM ItemEntity i WHERE i.type = :notesType", ItemEntity.class);
        typedQuery.setParameter("notesType", notesType);
    return typedQuery.getResultList();
    }
}
