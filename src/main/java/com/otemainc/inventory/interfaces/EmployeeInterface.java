package com.otemainc.inventory.interfaces;

import com.otemainc.inventory.entity.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public interface EmployeeInterface {
    
    public ObservableList<Employee> EMPLOYEELIST = FXCollections.observableArrayList();
}
