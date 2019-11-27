package com.otemainc.inventory.interfaces;

import com.otemainc.inventory.entity.Sale;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public interface SaleInterface {

    public ObservableList<Sale> SALELIST = FXCollections.observableArrayList();
}
