package rest;

import model.ItemEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Path("/item")
public class ItemRestService {

    @GET
    public Optional<ItemEntity> getById(int id) {
        Optional<ItemEntity> item = Optional.empty();
        return item;
    }

    @GET
    public List<ItemEntity> getAll() {
        List<ItemEntity> itemsList = new ArrayList<>();
        return itemsList;
    }
}