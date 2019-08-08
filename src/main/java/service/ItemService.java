package service;

import model.ItemEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemService {
    public Optional<ItemEntity> getById(int id) {
        Optional<ItemEntity> item = Optional.empty();
        return item;
    }

    public List<ItemEntity> getAll() {
        List<ItemEntity> itemsList = new ArrayList<>();
        return itemsList;
    }
}
