package service;

import model.ItemModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemService {
    public Optional<ItemModel> getById(int id) {
        Optional<ItemModel> item = Optional.empty();
        return item;
    }

    public List<ItemModel> getAll() {
        List<ItemModel> itemsList = new ArrayList<>();
        return itemsList;
    }
}
