package rest;

import dto.ItemCreateDto;
import dto.ItemDTO;
import model.NotesType;
import service.ItemService;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Path("/item")
public class ItemRestService {

    @Inject
    ItemService itemService;

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public ItemDTO getById(@PathParam("id") Integer id) {
        Optional<ItemDTO> byId = itemService.getById(id);
        if(byId.isPresent()){
           return byId.get();
        }
       throw new WebApplicationException(Response.Status.NOT_FOUND);
    }

    @Produces("application/json")
    @GET
    public List<ItemDTO> getAll() {
        List<ItemDTO> all = itemService.getAll();
        return all;
    }

    @POST
    @Consumes("application/json")
    public void createItem (ItemCreateDto itemCreateDto){
        itemService.createItem(itemCreateDto);
    }

    @GET
    @Path("/type")
    @Produces("application/json")
    public List<ItemDTO> getItemListByType(@QueryParam("type") NotesType type){
        List<ItemDTO> itemListByType = itemService.getItemListByType(type);
        return itemListByType;
    }
}