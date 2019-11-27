package com.otemainc.inventory.interfaces;

import com.otemainc.inventory.entity.Supplier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public interface SupplierInterface {
    
    public ObservableList<Supplier> SUPPLIERLIST = FXCollections.observableArrayList();
}
