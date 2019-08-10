package rest;

import dto.ItemDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ItemRestServiceTest {
    @Mock
    ItemRestService itemRestService;
    LocalDateTime creationDate = LocalDateTime.now();
    LocalDateTime modificationDate = LocalDateTime.now();

    @Test
    public void getById() {
        //given
        Mockito.when(itemRestService.getById(5)).thenReturn(Optional.empty());
        //when
        itemRestService.getById(5);
        //then
        assertNotNull(itemRestService.getById(5));
    }

    @Test
    public void getAll() {
        //given
        List<ItemDTO> testedList = new ArrayList<>();
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setContent("test Content");
        itemDTO.setId(1);
        itemDTO.setCreationDate(creationDate);
        itemDTO.setModificationDate(modificationDate);
        testedList.add(itemDTO);

        //when
        Mockito.when(itemRestService.getAll()).thenReturn(testedList);
        //then

        assertNotNull(itemRestService.getAll());
        assertEquals(1, itemRestService.getAll().size());

    }
}