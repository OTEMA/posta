package com.otemainc.inventory.interfaces;

import com.otemainc.inventory.entity.Invoice;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public interface ReportInterface {
 
    public ObservableList<Invoice> REPORTLIST = FXCollections.observableArrayList();
}
