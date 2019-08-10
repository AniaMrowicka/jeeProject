package rest;

import dto.ItemDTO;
import model.ItemEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ItemRestServiceTest {
    ItemRestService itemRestService = new ItemRestService();
    LocalDateTime creationDate = LocalDateTime.now();
    LocalDateTime modificationDate = LocalDateTime.now();
    @Test
    public void getById() {
        //given
        int id = 5;
        //when
        //then
       assertNotNull(itemRestService.getById(5));
    }

    @Test
    public void getAll() {
        //given
        List<ItemDTO> testedList = new ArrayList<>();
        ItemDTO itemDTO= new ItemDTO();
        itemDTO.setContent("test Content");
        itemDTO.setId(1);
        itemDTO.setCreationDate(creationDate);
        itemDTO.setModificationDate(modificationDate);
        testedList.add(itemDTO);

        //when
        Mockito.when(itemRestService.getAll()).thenReturn(testedList);
        //then
        assertNotNull(itemRestService.getAll());
        assertEquals(1,itemRestService.getAll().size());

    }
}