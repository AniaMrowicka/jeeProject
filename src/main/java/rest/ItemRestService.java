package rest;

import dto.ItemDTO;
import model.ItemEntity;
import model.NotesType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Path("/item")
public class ItemRestService {
    @PersistenceContext
    private EntityManager entityManager;

    @GET
    @Path("/{id}")
    public Optional<ItemDTO> getById(@PathParam("id") int id) {
        Optional<ItemDTO> item = Optional.empty();
        return item;
    }
    //
    @GET
    public List<ItemDTO> getAll() {
        List<ItemDTO> itemsList = new ArrayList<>();
        return itemsList;
    }
    @GET
    @Path("/test")
    @Transactional(Transactional.TxType.REQUIRED)
    public String test() {
        TypedQuery<ItemEntity> query = entityManager.createQuery("SELECT i FROM ItemEntity i", ItemEntity.class);
        int size = query.getResultList().size();

        ItemEntity item = new ItemEntity();
        item.setCreationDate(LocalDateTime.now());
        item.setType(NotesType.SCAN);
        item.setContent("test 123");

        entityManager.persist(item);
        return String.valueOf(entityManager.isOpen());
    }
}