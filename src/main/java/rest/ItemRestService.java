package rest;

import dto.ItemDTO;
import model.ItemEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Path("/item")
public class ItemRestService {

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
}