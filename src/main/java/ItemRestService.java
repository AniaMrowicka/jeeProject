import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/item")
public class ItemRestService {

    @GET
    public ItemModel getById (int id){
        return null;
    }

    @GET
    public List<ItemModel> getAll(){
        return null;
    }
}
