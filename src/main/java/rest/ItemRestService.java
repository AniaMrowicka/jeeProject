package rest;

import model.ItemModel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Path("/item")
public class ItemRestService {

    @GET
    public Optional<ItemModel> getById(int id) {
        Optional<ItemModel> item = Optional.empty();
        return item;
    }

    @GET
    public List<ItemModel> getAll() {
        List<ItemModel> itemsList = new ArrayList<>();
        return itemsList;
    }
}