package com.otemainc.inventory.interfaces;

import com.otemainc.inventory.entity.Category;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public interface CategoryInterface {
    
    public ObservableList<Category> CATEGORYLIST = FXCollections.observableArrayList();   
}
